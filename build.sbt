import AssemblyKeys._

assemblySettings

name := "MLI"

version := "1.0"

organization := "edu.berkeley.cs.amplab"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.10" % "0.9.0-incubating" % "provided",
  "org.apache.spark" % "spark-mllib_2.10" % "0.9.0-incubating" % "provided",
  "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test"
)

resolvers ++= Seq(
  "Typesafe" at "http://repo.typesafe.com/typesafe/releases",
  "Scala Tools Snapshots" at "http://scala-tools.org/repo-snapshots/",
  "ScalaNLP Maven2" at "http://repo.scalanlp.org/repo",
  "Spray" at "http://repo.spray.cc"
)

scalacOptions ++= Seq("-deprecation", "-unchecked")

javaOptions += "-Xmx2G"

EclipseKeys.withSource := true
