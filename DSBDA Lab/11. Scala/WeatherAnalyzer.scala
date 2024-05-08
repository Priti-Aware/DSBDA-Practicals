object WeatherAnalyzer {
  def main(args: Array[String]){
    val temperatureData = List(72, 68, 75) // Example temperature data
    val dewPointData = List(65, 63, 68) // Example dew point data
    val windSpeedData = List(5, 7, 10) // Example wind speed data

    val avgTemperature = temperatureData.sum.toFloat / temperatureData.length
    val avgDewPoint = dewPointData.sum.toFloat / dewPointData.length
    val avgWindSpeed = windSpeedData.sum.toFloat / windSpeedData.length

    println("Average Temperature:"+avgTemperature)
    println("Average Dew Point: "+avgDewPoint)
    println("Average Wind Speed: "+avgWindSpeed)
  }
}