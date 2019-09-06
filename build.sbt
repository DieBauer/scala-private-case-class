name := "reproducer"

scalaVersion in ThisBuild := "2.13.0"
crossScalaVersions in ThisBuild := Seq(
    "2.13.0",
    "2.12.9",
    "2.11.12",
    "2.10.7",
)

val reproducer = (project in file("."))
