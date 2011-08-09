name := "kestrel_example"

scalaVersion := "2.7.7"

resolvers ++= Seq(
  "twitter repo" at "http://maven.twttr.com"
)

libraryDependencies ++= Seq(
  "net.lag" % "kestrel" % "1.3.0" 
)

scalacOptions ++= Seq( "-deprecation",  "-unchecked" )

seq(sbtassembly.Plugin.assemblySettings: _*)

