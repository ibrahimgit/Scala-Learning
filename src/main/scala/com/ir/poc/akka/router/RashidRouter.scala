package com.ir.poc.akka.router

import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.Directives._
import com.ir.poc.akka.services.impl.RashidServiceImpl
import com.ir.poc.akkahttp.JsonSupport

trait RashidRouter extends JsonSupport {

  val rashidRouter = {
    pathSingleSlash {
      get {
        complete(StatusCodes.OK, "Testing path single slash")
      }
    } ~
    path("service") {
      path("service1") {
        get {
          complete(StatusCodes.OK, "Testing service service1")
        }
      } ~
      get {
        complete(RashidServiceImpl.doSomething("Rashid"))
      }
    } ~
    path("params") {
      parameter('param1.as[String], 'param2.as[Int]) { (param1, param2) =>
        get {
          complete(RashidServiceImpl.testParams(param1, param2))
        }
      }
    } ~
    pathPrefix("path1"/"path2") { //"path1/path2" didn't work
      pathEnd {
        get {
          complete(StatusCodes.OK, "Testing path enddd")
        }
      } ~
      path("newPath") {
        get {
          complete(StatusCodes.OK, "Testing path")
        }
      }
    } ~
    pathPrefix("path11"/"path22") { //path11/path22/**/*
      get {
        complete(StatusCodes.OK, "Testing path prefix")
      }
    }


    /*pathPrefix("path1"/"path2") {
      get {
        complete(StatusCodes.OK, "Testing path prefix")
      }
    }  ~*/
    /*pathSuffix("path11"/"path44") {
      get {
        complete(StatusCodes.OK, "Testing path suffix")
      }
    }*/// ~

  }


}
