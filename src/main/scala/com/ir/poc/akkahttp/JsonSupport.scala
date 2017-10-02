package com.ir.poc.akkahttp

import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import com.ir.poc.akka.{Rash1, Rash3}
import spray.json.DefaultJsonProtocol

trait JsonSupport extends SprayJsonSupport with DefaultJsonProtocol {

  implicit val rash1 = jsonFormat2(Rash3)
  implicit val rash2 = jsonFormat2(Rash1)

}
