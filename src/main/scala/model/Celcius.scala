package model

import `trait`.ConvertTrait

class Celcius extends ConvertTrait{
  override def toCelcius(value: Double): Double = value

  override def toFahrenheit(value: Double): Double = (value*(9.0/5.0)) + 32.0

  override def toKelvin(value: Double): Double = value + 273.15

  override def toReaumur(value: Double): Double = value * (4.0/5.0)
}
