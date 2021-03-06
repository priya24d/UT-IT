name := "Ut-Assignment"

version := "0.1"

scalaVersion := "2.13.4"
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.3" % Test,
  "org.mockito" %% "mockito-scala" % "1.5.12" % Test
)

name := "Ut-Assignment"

version := "0.1"

scalaVersion := "2.13.4"

/* Creating a module for question1 and question2 then providing testing dependencies */
lazy val UnitTest = project.in(file("UnitTest"))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.3" % Test,
      "org.mockito" %% "mockito-scala" % "1.5.12" % Test
    )
  )

/* Creating a module for question3 then providing testing dependencies  */
lazy val Unit_IntegrationTest = project.in(file("Unit_IntegrationTest"))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.3" % Test,
      "org.mockito" %% "mockito-scala" % "1.5.12" % Test
    )
  )

lazy val root = project.in(file(".")).aggregate(UnitTest, Unit_IntegrationTest)

