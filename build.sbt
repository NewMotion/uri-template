enablePlugins(OssLibPlugin)

organization := "com.newmotion"

name         := "uri-template"

description  := "URI Template"

scalaVersion := tnm.ScalaVersion.prev

crossScalaVersions := Seq(tnm.ScalaVersion.aged, tnm.ScalaVersion.curr, tnm.ScalaVersion.prev)

libraryDependencies ++= {
  Seq(
    "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2",
    "org.scalatest"          %% "scalatest"                % "3.0.8" % "test"
  )
}
