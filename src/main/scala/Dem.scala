import org.apache.spark.sql.SparkSession

object Dem extends App{



  val spark = SparkSession.builder().appName("dem").master("local[*]").getOrCreate()


  println("Spark created")
}
