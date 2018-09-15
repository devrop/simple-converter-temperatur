package model

class Converter {

    private val celcius:Celcius = new Celcius()
    private val fahrenheit:Fahrenheit = new Fahrenheit()
    private  val reaumur:Reaumur = new Reaumur()
    private val kelvin:Kelvin = new Kelvin()


   def  convertingTemperature(skalaAwal:String,skalaTujuan:String,value:Double):Double = {
     val skalaAwalConvert:String =substring(skalaAwal)
     val skalaTujuanConvert:String = substring(skalaTujuan)
      skalaAwalConvert match {
        case "F" => fromFahrenheit(skalaTujuanConvert,value)
        case "C" => fromCelcius(skalaTujuanConvert,value)
        case "R" => fromReaumur(skalaTujuanConvert,value)
        case "K" => fromKelvin(skalaTujuanConvert,value)
        case _ => 0.0
      }


  }
  private def substring(word:String):String = word.substring(0,1).toUpperCase()

  private def fromFahrenheit(skalaTujuan:String,value:Double) : Double = {
    skalaTujuan match {
      case "K" => fahrenheit.toKelvin(value)
      case "R" => fahrenheit.toReaumur(value)
      case "C" => fahrenheit.toCelcius(value)
      case "F" => fahrenheit.toFahrenheit(value)
      case _ => 0.0
    }
  }
    private def fromCelcius(skalaTujuan: String, value: Double): Double = {

      skalaTujuan match {
        case "K" => celcius.toKelvin(value)
        case "R" => celcius.toReaumur(value)
        case "C" => celcius.toCelcius(value)
        case "F" => celcius.toFahrenheit(value)
        case _ => 0.0
      }
    }
      private def fromReaumur(skalaTujuan: String, value: Double): Double = {
        skalaTujuan match {
          case "K" => reaumur.toKelvin(value)
          case "R" => reaumur.toReaumur(value)
          case "C" => reaumur.toCelcius(value)
          case "F" => reaumur.toFahrenheit(value)
          case _ => 0.0
        }

      }


  private def fromKelvin(skalaTujuan: String, value: Double): Double = {
    skalaTujuan match {
      case "K" => kelvin.toKelvin(value)
      case "R" => kelvin.toReaumur(value)
      case "C" => kelvin.toCelcius(value)
      case "F" => kelvin.toFahrenheit(value)
      case _ => 0.0
    }

  }

  }











