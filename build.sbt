

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.1",
      version      := "0.1.0-SNAPSHOT",
      javacOptions ++= Seq("-source", "1.8", "-target", "1.8","-encoding","UTF-8"),
      scalacOptions := Seq("-unchecked", "-deprecation"),
      // For project with only Java sources. In order to compile Scala sources, remove the following two lines.
      crossPaths := false,
      autoScalaLibrary := false
    )),
    name := "practicaAutomatizacion",
    libraryDependencies ++= Seq(
      "io.vavr" % "vavr" % "0.9.2",
      "junit" % "junit" % "4.12" % "test",
      "com.novocode" % "junit-interface" % "0.11" % "test",
      //"org.projectlombok"%"lombok"%"1.16.16",
      "org.mockito"%"mockito-core"%"2.8.9"%"test",
      "org.powermock"%"powermock-api-mockito2"%"1.7.3"%"test",
      "org.powermock"%"powermock-module-junit4"%"1.7.4"%Test,
      "org.seleniumhq.selenium" % "selenium-java" % "2.35.0" % "test"

)

  )