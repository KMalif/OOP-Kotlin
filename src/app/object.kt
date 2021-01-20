package app

import data.Person

fun main (){
    // membuat object dengan memanggil class person
    val alif = Person()
    //manipulasi properties dari class person
    alif.firstName = "Alif"


    val khafidul = Person()
    khafidul.firstName = "Khafidul"
    khafidul.middleName = " "
    khafidul.lastName = "Mualif"


    //mengakses properties >> NamaObject.Properties
    println(khafidul.firstName)
    println(khafidul.lastName)




}