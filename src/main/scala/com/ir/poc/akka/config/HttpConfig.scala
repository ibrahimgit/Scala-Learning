package com.ir.poc.akka.config

import com.typesafe.config.{Config, ConfigFactory}

trait HttpConfig {

  private val config: Config = ConfigFactory.load()

 // private val httpConfig: Config = config.getConfig("http")
  val host = config.getString("http.interface")
  val port = config.getInt("http.port")


}
