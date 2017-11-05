package com.ir.poc.scala


import scala.Array._
object Scala {


  def main(args: Array[String]): Unit = {
    var value : Int = 9
    val constantValue : Int = 10
    var value2 = 88
    var doubleVal = 2.0
    //strVal = ""
    var str :String = "gjgjh"

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

    var nno = ScalaClass("dsasa") //creating an instance of ScalaClass using companion object
    //nno.doSomething()
    nno.doNothing()

    //var no = new Testt("fdsfds") //Testt is no more a class, it is now an object, so no use of new
    Testt.doSomething()

    println("Factoral of " + value + " is " + factorial(value))

    println(addTwoValues(value, value2))

    var partiallyBindingFuction = addTwoValues(_ : Int, value)

    println(partiallyBindingFuction(6))

    callByName(addTwoValues(4, 10))

    callByValue(addTwoValues(4, 10))

    //var c1 = "test string"

    //c1 = "gfghf";

    var c = printme

    val f = (x : Int , y : Int) => x+y //functional literals are function values which are object basically
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


    val strList = List("sda", "dsad", "dasds", "sads")
    var sum = 0
    strList.map(str => sum += str.length)

    println(s"Sum of cars ${sum}")

    val result = strList.fold("") {(z, i) => {
      z+i
    }}

    println("Fold test: " + result)
    val strList1 = List("sda", "dsad", "dasds", "sads")
    val resultt = strList1.foldLeft(0) {(sum, string) => sum + string.length} // don't know what is the problem here, hence commenting out.

    println("Fold test sum: " + resultt)


    //val testCaseClass = TestCaseClass(10, "")





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

    val c1 = CaseClass("Rashid", 25, true)

    val tst = Testt.yy

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
