name := "scalapg"

version := "1.0"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
  "org.postgresql" % "postgresql" % "9.3-1102-jdbc41",
  "org.squeryl" %% "squeryl" % "0.9.5-6",
  "org.slf4j" % "slf4j-nop" % "1.6.4"
)
