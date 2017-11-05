name := """get-smart-play-test"""
organization := "e-business"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.2"

libraryDependencies += guice
libraryDependencies += "org.postgresql" % "postgresql" % "42.0.0"
libraryDependencies += javaJdbc

