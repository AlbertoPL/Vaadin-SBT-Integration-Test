resolvers += "Arnauld" at "https://github.com/Arnauld/arnauld.github.com/tree/master/maven2"

libraryDependencies <+= sbtVersion(v => "com.github.siasia" %% "xsbt-web-plugin" % (v+"-0.2.4"))

addSbtPlugin( "org.technbolts" %% "sbt-vaadin-plugin" %  "0.0.1-SNAPSHOT" intransitive())