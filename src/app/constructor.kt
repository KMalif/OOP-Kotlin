package app

import data.Car

fun main() {
    //secondary construktor cara menggunakan
    val Silvia = Car("Nissan")

    //contoh penggunaan constructor
    val Supra = Car("Toyota", "Supra")
    val ModelX = Car("Tesla", "ModelX")

    println(Supra.Merek)
    println(Supra.Tahun)
    println(ModelX.Merek)
    println(ModelX.Tahun)

}