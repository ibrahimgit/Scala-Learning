package com.ir.poc.akka

import java.util.Calendar

import akka.actor.{ActorSystem, Props}
import com.ir.poc.akka.actor.HelloActor

object AkkaTest extends App {

  //override def main(args: Array[String]): Unit = {
    val system = ActorSystem("Saba")
    val helloActor = system.actorOf(Props(new HelloActor("Saba")))
    helloActor ! "hello"
    val future = helloActor ! "rash1"
    helloActor ! "rash2"
    helloActor ! "hell"



  //}

}
