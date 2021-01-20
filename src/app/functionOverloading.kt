package app

import data.Person

fun main() {

    val alif = Person()

    //memanggil dua function dengan nama yang sama tetapi paramnya berbeda
    alif.sayHello("there")
    alif.sayHello("khafidul", "mualif")
}