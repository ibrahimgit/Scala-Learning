package com.ir.poc.akka.router

import akka.http.scaladsl.server.Directives._

trait Routes extends AkkaRouter with RashidRouter {

  val routes = {
    pathPrefix("api") {
      akkaRoute ~
      rashidRouter
    }
  }

}
