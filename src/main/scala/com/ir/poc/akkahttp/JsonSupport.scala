package com.ir.poc.akkahttp

import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import com.ir.poc.akka.model.{Rash1, Rash3}
import spray.json.DefaultJsonProtocol

trait JsonSupport extends SprayJsonSupport with DefaultJsonProtocol {

  implicit val rash33 = jsonFormat3(Rash3)
  implicit val rash11 = jsonFormat2(Rash1)
  //implicit val rash22 = jsonFormat2(Rash2)

}
