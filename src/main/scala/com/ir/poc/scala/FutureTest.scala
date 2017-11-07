package com.ir.poc.scala


import akka.http.scaladsl.model.StatusCodes.Success

import scala.concurrent.{ExecutionContext, Future}

object FutureTest extends  App {

  implicit val ec = ExecutionContext.global;
  val s = "Hello";

  var f = Future {
    Thread.sleep(1000);
    s + " Saba Ibrahim"
  }

  println("I am here")
 // f.onComplete { // this works
  f onComplete { // this too works
    case msg => println(msg)
    case _ => println("dasd")
  }
  println("I am there")
  Thread.sleep(2000)
  println("I am done")
}
