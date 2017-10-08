organization := "com.ir.poc"
name := "Scala-Learning"

version := "0.1"

scalaVersion := "2.12.3"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

//libraryDependencies += "com.typesafe.akka" % "akka-actor" % "2.0.2"

libraryDependencies ++= {
  val akkhttpVersion = "10.0.10"
  val sprayJsonVersion = "10.0.10"
  val akkaVersion = "2.5.4"
  Seq(
    "com.typesafe.akka" %% "akka-http" % akkhttpVersion,
    "com.typesafe.akka" %% "akka-http-spray-json" % sprayJsonVersion,
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-stream" % akkaVersion
  )
}


