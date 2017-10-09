package com.ir.poc.scala

class Ibrahim(x: Int, msg: String, value: Double) {

  def this(x: Int, msg: String) {
    this(x, msg, 0.0)
  }

  def this (x: Int) {
    this(x, null)
  }



  def doStuff(): Unit = {
    println("Value Class: " + x)
  }
}
