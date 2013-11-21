object VersionKeys {
  import sbt.settingKey
  import sbt.ModuleID

  val scalaTestVersion = settingKey[String]("Scalatest version.")

  def excludeOldModules(m: ModuleID) = m.exclude("org.scala-lang.modules", "scala-parser-combinators_2.11.0-M6").exclude("org.scala-lang.modules", "scala-xml_2.11.0-M6")
}
