package com.ir.poc.akka.router

import akka.http.scaladsl.server.Directives._

trait Routes extends AkkaRouter {

  val routes = {
    pathPrefix("api") {
      akkaRoute
    }
  }

}
