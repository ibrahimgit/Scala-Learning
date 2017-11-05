package com.ir.poc.akka.config

import scala.concurrent.duration._
import akka.actor.{ActorSystem, Props}
import akka.stream.ActorMaterializer
import akka.util.Timeout
import com.ir.poc.akka.actor.{HelloActor, IRashidActor}
import com.ir.poc.akkahttp.Ibbu.system

trait AkkaConfig {

  implicit val system = ActorSystem("Ibbu")
  implicit val materializer = ActorMaterializer()
  //implicit val executionContext = system.dispatcher // This is required while shutting down the server
  implicit val timeout = Timeout(20 seconds)

  val helloActor = system.actorOf(Props(new HelloActor("Rashid")), "HelloActor")
  val irashid = system.actorOf(Props[IRashidActor], "iRashid")


}
