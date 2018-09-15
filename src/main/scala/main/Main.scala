package main

import model.Converter

import scala.io.StdIn
object Main extends App{
  print("Masukkan skala awal : ")
  val sc = StdIn.readLine()
  print("Masukkan skala tujuan : ")
  val sc2 = StdIn.readLine()
  print("Masukkan nilai : ")
  val sc3 = StdIn.readInt()
  val d :Double = sc3.toDouble
  val convert = new Converter
  val nilai:Double = convert.convertingTemperature(sc,sc2,d)
  println(nilai)

}
