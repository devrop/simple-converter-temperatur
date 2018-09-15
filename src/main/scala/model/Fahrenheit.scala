package model

import `trait`.ConvertTrait

class Fahrenheit extends ConvertTrait{



  override def toCelcius(value: Double): Double = (value-32.0) * (5.0/9.0)

  override def toFahrenheit(value: Double): Double = value

  override def toReaumur(value: Double): Double = (value -32.0) *(4.0/9.0)

  override def toKelvin(value: Double): Double = (value + 459.67) * (5.0/9.0)
}
