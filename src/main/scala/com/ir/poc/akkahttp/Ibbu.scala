package com.ir.poc.akkahttp

import akka.actor.{ActorSystem, Props}

import scala.concurrent.duration._
import akka.http.scaladsl.model.{HttpEntity, StatusCodes}
import akka.http.scaladsl.server.ContentNegotiator.Alternative.ContentType
import akka.stream.ActorMaterializer
import akka.http.scaladsl.Http
import akka.pattern._
import akka.http.scaladsl.server.Directives._
import akka.util.Timeout
import com.ir.poc.akka.model.{Rash1, Rash3}
import com.ir.poc.akka.{HelloActor, IRashid}

object Ibbu extends JsonSupport {

  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem("Saba_Rashid")
    implicit val materializer = ActorMaterializer()
    implicit val executionContext = system.dispatcher
    implicit val timeout = Timeout(20 seconds)

    val helloActor = system.actorOf(Props(new HelloActor("Rashid")), "HelloActor")
    val irashid = system.actorOf(Props[IRashid], "iRashid")

    val route =
      path("hello") {
        get {
          complete(StatusCodes.OK, "Hello world")
        }
      } ~
      path("test") {
        get {
          onSuccess(helloActor ? "Saba") {
            case msg: String => complete(StatusCodes.OK, msg)
            case _ => complete(StatusCodes.InternalServerError)
          }
        }
      } ~
    path("json") {
      get {
        complete(Rash1("Saba", 22))
      }
    } ~
    pathPrefix("customers") {
      post {
        (entity(as[Rash1])) { rash1 =>
          onSuccess(irashid ? rash1) {
            case msg :String => complete(Rash3(msg, true, 23))
            case _ => complete(StatusCodes.InternalServerError)
          }

        }
      }
    }

    val binding = Http().bindAndHandle(handler = route, interface = "localhost", port = 8090)
    println("server started at 8090")
    //binding.flatMap(_.unbind()).onComplete(_ => system.terminate())
    //system.terminate()
  }




  }
