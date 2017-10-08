package com.ir.poc.akkahttp


import akka.http.scaladsl.Http
import com.ir.poc.akka.config.HttpConfig
import com.ir.poc.akka.router.Routes

object Ibbu extends App with Routes with HttpConfig {

  //def main(args: Array[String]): Unit = {





  val binding = Http().bindAndHandle(handler = routes, interface = host, port = port)
  println(s"server started at $host:$port")
  //binding.flatMap(_.unbind()).onComplete(_ => system.terminate())
  //system.terminate()
  //}




  }
