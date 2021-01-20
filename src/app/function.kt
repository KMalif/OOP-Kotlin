package app

import data.Person

fun main() {
    val alif = Person()
    alif.firstName = "Khafidul"
    alif.lastName = "Mualif"

    alif.sayHello("You")
    alif.learn()

    val fullname = alif.getFullName()
    println(fullname)
}