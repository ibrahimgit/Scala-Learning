package com.ir.poc.scala

class Employee (val nm: String, val ag: Int){

  private var name :String = nm
  private var age :Int = ag

  def getName() {
    nm
  }

  def setName(nm :String)  {
    name = nm
  }

  def getAge() {
    age
  }

  def setAge(ag: Int) {
    age = ag
  }

}
