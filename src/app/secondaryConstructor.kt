package app

import data.Address

fun main() {

    val address1 = Address("Jalan 1", "Tegal")
    val address2 = Address("Jalan2", "Tegal", "Indonesia")

    println(address1.Street)
    println(address2.Street)

}