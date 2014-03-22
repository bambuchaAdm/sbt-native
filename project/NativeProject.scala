import sbt._
import sbt.Configuration

object NativeProject {

  def apply(id: String,
            base: File,
            aggregate: => Seq[ProjectReference] = Nil,
            dependencies: => Seq[ClasspathDep[ProjectReference]] = Nil,
  		      delegates: => Seq[ProjectReference] = Nil,
            settings: => Seq[Def.Setting[_]] = Nil,
            configurations: Seq[Configuration] = Nil, // FIXME
  		      auto: AddSettings = AddSettings.allDefaults): Project = {

    Project(id,base,aggregate, dependencies, delegates,settings, configurations, auto)
  }


}