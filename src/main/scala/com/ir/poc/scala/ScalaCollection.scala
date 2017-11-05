package com.ir.poc.scala

object ScalaCollection extends App {

  val list1: List[Int] = List(1,3,4,5,8,7,5,10)
  val list2 : List[Int]= 1::2::3::4::Nil
  val list3 = list1::list2

  val list4 = list3.+:(list3)
  val list5 = list1.+:(10)
  //println(s"List3 is flattened - ${list3.flatten}")
  //println(s"List3 is flattened - ${list3.flatMap(x => x.map(_*2))}")
  println(s"List3 is ${list3}")

  list4.map(x => println(x))

  println(s"List5 is ${list5}")

  println(s"Drop test: ${list1.drop(3)}")
  println(s"Drop while test: ${list1.dropWhile(x => x % 2 != 0)}")
  println(s"Drop right test: ${list1.dropRight(5)}")
  //println(list1.flatten) //it's not working, dunno why
  val stralist = Seq("Saba", "Ibrahim")
  println(stralist.map(_.toUpperCase))
  println(stralist.flatten)


  val seq1 = Seq(1, 2, 3)

  seq1.map(x => print(x))

  val map1 = Map(1 -> "Ibrahim", 2 -> "Saba", (3, "Rashid"))

  println(s"Map is ${map1}")

  var value: String = map1.get(1).get

  println(s"Map value ${value}")

  var valu : Option[String] = map1.get(8)

  println(s"Map value ${valu}")


}
