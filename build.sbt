name:="Vaadin with SBT"

version:="1.0"

scalaVersion:="2.9.1"

vaadinWidgetSet:="scalaadin.gwt.CombinedWidgetset"

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse" % "1.4.0")

seq(webSettings :_*)

libraryDependencies += "org.mortbay.jetty" % "jetty" % "6.1.22" % "container"