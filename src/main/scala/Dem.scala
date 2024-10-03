import org.apache.spark.sql.SparkSession

object Dem extends App{



  val spark = SparkSession.builder().appName("dem").master("local[*]").getOrCreate()

println("spark works")
  val df = spark.read
                .format("csv")
                .option("header", "true")
    .option("delimiter", ",")
    .load("D:/Scala/filecsv.csv")


df.show()

spark.stop


}
