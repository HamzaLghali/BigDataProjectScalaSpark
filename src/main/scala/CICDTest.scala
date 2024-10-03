import org.apache.spark.sql.SparkSession

object CICDTest extends App{


  val spark = SparkSession.builder().master("local[*]").appName("myApp").getOrCreate()

  println("itworks")

  spark.stop

}
