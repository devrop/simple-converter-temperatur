package model

import `trait`.ConvertTrait

class Kelvin extends ConvertTrait{
  override def toCelcius(value: Double): Double = value - 273.15

  override def toFahrenheit(value: Double): Double = (value * (9.0/5.0)) -459.67

  override def toKelvin(value: Double): Double = value

  override def toReaumur(value: Double): Double = toCelcius(value) * (4.0/5.0)

}
