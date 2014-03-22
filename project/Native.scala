import sbt._
import Keys._

object Native extends NativeBuild {

  lazy val hallo = taskKey[Unit]("Greet")

  val hallowSetting = hallo := { println("Hi") }


  lazy val localSettings = Seq[Def.Setting[_]](
    name := "Native",
    version := "0.0.1",
    projectID := ModuleID("pl.hackerspace-krk","hbuilder","0.0.1")
  ) ++ Seq[Def.Setting[_]](hallowSetting)


  val main = NativeProject("sbt-test",file("."), settings = localSettings, configurations = Configurations.default)
}