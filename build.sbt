name := "LBSRefresh"

version := "1.0"

scalaVersion := "2.11.7"
libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
libraryDependencies += "io.appium" % "java-client" % "3.2.0"
libraryDependencies += "org.seleniumhq.selenium" % "selenium-java" % "2.35.0" % "test"
libraryDependencies += "io.selendroid" % "selendroid" % "0.16.0"
libraryDependencies += "io.selendroid" % "selendroid-client" % "0.16.0"
libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaVersion.value
libraryDependencies += "com.propensive" %% "rapture" % "2.0.0-M1"
libraryDependencies += "com.propensive" %% "rapture-json" % "2.0.0-M1"
libraryDependencies += "com.propensive" %% "rapture-json-json4s" % "2.0.0-M1"

testOptions in Test += Tests.Argument("-P")