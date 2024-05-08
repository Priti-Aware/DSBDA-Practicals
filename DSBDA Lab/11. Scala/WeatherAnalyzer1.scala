import scala.io.Source

object WeatherAnalyzer1 {
  def main(args: Array[String]) {
    val filename = "weather.csv"
    val weatherData = readWeatherData(filename)

    if (weatherData.nonEmpty) {
      val avgTemperature = weatherData.map(_._1).sum.toFloat / weatherData.length
      val avgDewPoint = weatherData.map(_._2).sum.toFloat / weatherData.length
      val avgWindSpeed = weatherData.map(_._3).sum.toFloat / weatherData.length
      
       println("Average Temperature:"+avgTemperature)
       println("Average Dew Point: "+avgDewPoint)
       println("Average Wind Speed: "+avgWindSpeed)
    } else {
      println("No weather data found.")
    }
  }

  def readWeatherData(filename: String): List[(Double, Double, Double)] = {
    Source.fromFile(filename).getLines().toList.tail.map { line =>
      val Array(temperature, dewPoint, windSpeed) = line.split(",").map(_.trim.toDouble)
      (temperature, dewPoint, windSpeed)
    }
  }
}