name := "React Scala.js Facade Test"

scalaVersion := "2.11.6"

enablePlugins(ScalaJSPlugin)

// Minimal usage
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "0.9.0"
)
