package com.ir.poc.scala

import Array._
object Scala {


  def main(args: Array[String]): Unit = {
    var value : Int = 9
    val constantValue : Int = 10
    var value2 = 88
    var doubleVal = 2.0
    //strVal = ""
    val str :String = "gjgjh"

    val array1 = Array(1, 2, 3)
    val array2 = Array(3, 4, 5)

    var array3 = concat(array1, array2)

    for(a <- array3) {
      println(a)
    }

    var arrays : Array[String] = new Array[String](3)

    arrays = Array("fdffd", "fghfh", "ghghj")

    for ( a <- arrays) {
      println(a)
    }

    for ( i <- 1 until 10) {
      println(i)
    }


    println("Hello Saba")
    println("Value: " + value)
    value = 8
    //sconstantValue = 17 // not possible

    callme("hello", value)

    val poc = new Rashid(65, "Saba")
    poc.doStuff(3, "Rashid")
    printme

    println("Factoral of " + value + " is " + factorial(value))

    println(addTwoValues(value, value2))

    var partiallyBindingFuction = addTwoValues(_ : Int, value)

    println(partiallyBindingFuction(6))

    callByName(addTwoValues(4, 10))

    callByValue(addTwoValues(4, 10))

    var c = printme

    var f = (x : Int , y : Int) => x+y
    println(f(10, 8))

    var list0 = List(0, 4, 5)
    var list1 = List("Ibrahim", "Saba", "Rashid")
    var list2 = 1 :: 2 :: 4 :: 5 :: Nil
    var list3 = list2 :: list0
    for (item <- list3)
      println(item)

    list3 = list2.::(list0)
    for(item <- list3)
      println(item)
  }

  def callByName(v: => Int) :Unit = {
    println("Call by name function")
    println(v)

  }

  def callByValue(v:Int) :Unit = {
    println("Call by value function")
    println(v)

  }

  def addTwoValues(a:Int, b:Int) :Int = {
    println("addTwoValues")
    a + b
  }

  def factorial(fact :Int) :Int = {
    if(fact <= 1 )
      1
    else {
      fact*factorial(fact-1)
    }
  }

  def callme(stringValue : String, value : Int): Unit = {
    println(stringValue)
    println(value)
  }

  def printme {
    println("Print me")

  }




}
