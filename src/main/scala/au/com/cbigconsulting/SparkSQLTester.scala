import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object SparkSQLTester {
 def main(args: Array[String]) {
   val sql = args(0)
   val conf = new SparkConf().setAppName("Spark SQL Tester")
   val sc = new SparkContext(conf)
   val sqlContext = new org.apache.spark.sql.hive.HiveContext(sc)

   val _ = sqlContext.sql(sql)
 }
}
