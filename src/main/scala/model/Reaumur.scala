package model

import `trait`.ConvertTrait

class Reaumur extends ConvertTrait{
  override def toCelcius(value: Double): Double = value* 5.0/4.0

  override def toFahrenheit(value: Double): Double = (value * (9.0/4.0)) + 32.0

  override def toReaumur(value: Double): Double = value

  override def toKelvin(value: Double): Double = toCelcius(value) + 273.15

}
