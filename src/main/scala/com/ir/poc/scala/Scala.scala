package com.ir.poc.scala


import scala.Array._
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


    println("Hello Rashid")
    println("Value: " + value)
    value = 8
    //sconstantValue = 17 // not possible

    callme("hello", value)

    val poc = new Rashid(65, "Rashid")

    poc.doStuff(3, "Rashid")
    printme

    var nno = new ScalaClass("dsasa")
    //nno.doSomething()
    nno.doNothing()

    var no = new Testt("fdsfds")
    no.doSomething()

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
    var list1 = List("Ibrahim", "Rashid", "Rashid")
    var list2 = 1 :: 2 :: 4 :: 5 :: Nil
    var list3 = list2 :: list0
    for (item <- list3)
      println(item)

    list3 = list2.::(list0)
    for(item <- list3)
      println(item)


    println(f1("Rashid"))
    println(range(5))
    println(double(5))
    println(area(5))
    println(testingCase("Rashid"))
    testhigherorderfunction(double, 5)
    testhigherorderfunction1(addTwoValues, 5, 10)

    val fn = (x:Int) => x + 1
    println(fn(10))
    println(fn.apply(100))


    var emp1 = new Employee("Rashid", 27)
    var emp2 = new Employee("Rashid", 31)

    val empList = List(emp1, emp2);

    println(empList.size + " " + empList.toString())

    empList.+:(new Employee("Ibrahim", 31))

    println(empList.size + " " + empList.toString())
    listformap

    val c1 = new CaseClass("Rashid", 25, true)

    val tst = new Testt("fdsd")

    //println(tst.strr)
    //println(tst.aa())
    test();
    //val ib = new Ibrahim()
    //println(ib.x) //not working for reasons
    //println(ib.value) //not working for reasons

    val ib1 = new Ibrahim(3)
    //println(ib1.x) //not working for reasons

    val ib2 = new Ibrahim(4, "message")
    //println(ib2.msg) //not working for reasons

    val ib3 = new Ibrahim(4, "ds", 0.9)





  }

  def test(): Unit = {
    var str :String = "dadsd"
    str.map( s => println(s"Hello $s"))

    var intt :Int = 5



  }


  case class CaseClass (fName: String, age: Int, iTProfessional :Boolean)
  def listformap(): Unit = {
    val listt = List(1, 2, 3, 4);

    val list1 = listt.map(x => x + 1 )

    for(l <- listt) yield println(l+5)


    println(listt.toString())
    println(list1.toString())
  }

  def testhigherorderfunction1(f: (Int, Int) => Int, value1 :Int,  value2 :Int) = {

    f(value1, value2)
  }

  def testhigherorderfunction(f: Int => Int, value :Int) = {
    f(value)
  }

  def double(x :Int) = x*x

  def area(radius :Int) = 3.14*double(radius)

  def f1(str :String) :String = s"Hello $str"

  def range(intt :Int)  = 1.to(intt)

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

  def testingCase(text : String)  :String = {
    text match {
        case "Rashid" => "Work"
        case "Rose" => "Red"
        case "Past" => "Memory"
    }
  }




}
