package com.ir.poc.akka.router

import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.Directives._
import com.ir.poc.akka.services.impl.RashidServiceImpl
import com.ir.poc.akkahttp.JsonSupport

trait RashidRouter extends JsonSupport {

  val rashidRouter = {
    path("service") {
      get {
        complete(RashidServiceImpl.doSomething("Saba"))
      }
    }
  }

}
