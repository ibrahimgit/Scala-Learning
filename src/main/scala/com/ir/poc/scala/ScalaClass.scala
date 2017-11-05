package com.ir.poc.scala

class ScalaClass(abc :String) {

  var str :String = abc

  def doNothing(): Unit = {
    println(str)
  }

}

object ScalaClass { // this is called companion object
  def apply(abc: String): ScalaClass = new ScalaClass(abc)
}

object SingletonClass {
  //def apply: SingletonClass = new SingletonClass()
}
