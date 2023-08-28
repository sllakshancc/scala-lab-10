def calculateAverage(temperatures: List[Double]): Double = {

  val fahrenheit = temperatures.map(c => (c * 9/5) + 32)

  val total = fahrenheit.reduce((x, y) => x + y)

  total / temperatures.length
}

@main def main() = {
    val temperatures = List(0.0, 10.0, 20.0, 30.0)
    val averageFahrenheit = calculateAverage(temperatures)
    println(s"Average Fahrenheit temperature: $averageFahrenheit")
}
