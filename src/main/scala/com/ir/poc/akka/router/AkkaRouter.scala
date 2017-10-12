package com.ir.poc.akka.router

import java.util.Calendar

import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.Directives._
import com.ir.poc.akka.config.AkkaConfig
import akka.pattern._
import com.ir.poc.akka.model.{Rash1, Rash2, Rash3}
import com.ir.poc.akkahttp.JsonSupport

trait AkkaRouter extends JsonSupport with AkkaConfig {

  val akkaRoute =
    path("hello") {
      get {
        complete(StatusCodes.OK, "Hello world")
      }
    } ~
      path("test") {
        get {
          onSuccess(helloActor ? "Rashid") {
            case msg: String => complete(StatusCodes.OK, msg)
            case _ => complete(StatusCodes.InternalServerError)
          }
        }
      } ~
      path("json") {
        get {
          //complete(Rash1("Rashid", 22))
          complete(Rash3("Rashid", true, 23))
        }
      } ~
      pathPrefix("customers") {
        post {
          (entity(as[Rash1])) { rash1 =>
            onSuccess(irashid ?   rash1) {
              case msg :String => complete(Rash1(msg, 22))
              //case msg :String => complete(Rash2(msg, Calendar.getInstance().getTime))
              //case msg :String => complete(Rash3(msg, true, 23))
              case _ => complete(StatusCodes.InternalServerError)
            }

          }
        }
      }

}
