import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "play-slick-sample"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc, filters,
    "com.typesafe.slick" % "slick_2.10" % "2.0.1",
    "com.typesafe.play" % "play-slick_2.10" % "0.6.0.1",
    "com.github.tminglei" % "slick-pg_2.10" % "0.5.3",
    "com.github.tminglei" % "slick-pg_joda-time_2.10" % "0.5.3",
    "com.github.tminglei" % "slick-pg_play-json_2.10" % "0.5.3",
    "com.github.tminglei" % "slick-pg_jts_2.10" % "0.5.3",
    "org.postgresql" % "postgresql" % "9.3-1100-jdbc41",
    "joda-time" % "joda-time" % "2.3",
    "org.joda" % "joda-convert" % "1.5",
    "com.typesafe.play" % "play-json_2.10" % "2.2.1",
    "com.vividsolutions" % "jts" % "1.13"
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
    scalaVersion := "2.10.4"
    // Add your own project settings here      
  )

}
