package app

import data.Person

fun main (){
    // membuat object dengan memanggil class person
    val alif = Person()
    //manipulasi properties dari class person
    alif.FirstName = "Alif"


    val khafidul = Person()
    khafidul.FirstName = "Khafidul"
    khafidul.MiddleName = " "
    khafidul.LastName = "Mualif"


    //mengakses properties >> NamaObject.Properties
    println(khafidul.FirstName)
    println(khafidul.LastName)




}