package data

class Address {
    //Menambahkan properties dari class address
    var Street : String = ""
    var City : String = ""
    var Country : String = "Indonesia"

    constructor(paramStreet : String, paramCity : String){
        Street = paramStreet
        City = paramCity

    }

    constructor(paramStreet: String, paramCity: String, paramCountry: String)
            : this (paramStreet, paramCity){
        Country = paramCountry
    }






}