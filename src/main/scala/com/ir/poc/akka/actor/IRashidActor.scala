package com.ir.poc.akka.actor

import akka.actor.Actor
import com.ir.poc.akka.model.{Rash1, Rash2}


class IRashidActor extends Actor {

  override def receive: Receive = {
    case rash1: Rash1 => doStuff(rash1)
    case rash2: Rash2 => doNothing(rash2)

  }


  def doNothing(rash: Rash2): Unit = {
    println("Message received from sender: " + sender.path.name)
    println(s"Name is ${rash.name} and date of birth is ${rash.dob}")
    sender() ! s"greeting back from ${rash.name}"
  }

  def doStuff(rash1: Rash1): Unit = {
    println("Message recieved from sender: " + sender.path.name)
    println(s"Name is ${rash1.name}")

    sender() ! s"greeting back from ${rash1.name}"
  }

}
