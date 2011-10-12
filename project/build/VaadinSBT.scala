import sbt._

class VaadinSBT(info: ProjectInfo) extends DefaultWebProject(info)
{
  val jetty = "org.mortbay.jetty" % "jetty" % "6.1.18" % "test->default"
}