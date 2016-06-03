organization := "au.com.cbigconsulting"

version := "0.1.0"

scalaVersion := "2.10.4"

name := "SparkSQLTester"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")
javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

resolvers += "Cloudera Hadoop Repo" at "https://repository.cloudera.com/content/repositories/releases"
resolvers += "Cloudera Repos" at "http://repository.cloudera.com/cloudera/cloudera-repos/"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.6.0-cdh5.7.0" % "provided",
  "org.apache.spark" %% "spark-sql" % "1.6.0-cdh5.7.0" % "provided",
  "org.apache.spark" %% "spark-hive" % "1.6.0-cdh5.7.0" % "provided"
)

