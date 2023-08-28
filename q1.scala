object q1 {
  def main(args: Array[String]): Unit = {
    val inputTemperatures = List(0, 10, 20, 30)
    val averageFahrenheit = calculateAverage(inputTemperatures)
    println(s"Average Fahrenheit temperature: $averageFahrenheit")
  }

  def calculateAverage(temperatures: List[Int]): Double = {
    val fahrenheitTemperatures = temperatures.map(celsius => (celsius * 9/5) + 32)
    val sumOfTemperatures = fahrenheitTemperatures.reduce((temp1, temp2) => temp1 + temp2)
    val averageTemperature = sumOfTemperatures.toDouble / temperatures.length
    averageTemperature

  }
}
