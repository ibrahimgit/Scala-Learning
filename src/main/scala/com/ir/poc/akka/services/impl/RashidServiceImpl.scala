package com.ir.poc.akka.services.impl

import com.ir.poc.akka.model.{Rash1, Rash3}
import com.ir.poc.akka.services.RashidService

object RashidServiceImpl extends RashidService {

  override def doSomething(str: String) :Rash1 = Rash1(str,23)

  override def doStuff(strList: List[String]) = strList.map(str => println(str))

  override def testParams(param1: String, param2: Int) :Rash3 = Rash3(param1, true, param2)
}
