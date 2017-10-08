package com.ir.poc.akka.actor

import java.util.Calendar

import akka.actor.{Actor, Props}
import com.ir.poc.akka.model.{Rash1, Rash2}

class HelloActor(greeting: String) extends Actor {

  val irashid = context.actorOf(Props[IRashidActor], "Rashid")

  override def receive = {
    case "hello" => println(s"Hello $greeting");println("sender: " + sender())
    case "rash1" => callRash1()
    case "rash2" => callRash2()
    case msg : String => println(msg);sender() ! "message to Actor System"
    case _ => println("who the hell are you? :(")


  }

  def callRash2(): Unit = {
    irashid ! new Rash2("Rashid", Calendar.getInstance().getTime)
    println("sender: " + sender.path.name)

  }

  def callRash1(): Unit = {
    irashid ! new Rash1("Saba", 23)
    println("sender: " + sender.path.name)
  }

}
