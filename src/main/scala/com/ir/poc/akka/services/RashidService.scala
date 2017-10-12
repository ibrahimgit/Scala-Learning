package com.ir.poc.akka.services

import com.ir.poc.akka.model.{Rash1, Rash3}

trait RashidService {

  def doSomething(str :String) :Rash1
  def doStuff(strList : List[String])
  def testParams(param1: String, param2 :Int) :Rash3

}
