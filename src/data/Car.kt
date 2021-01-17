package data

class Car(paramMerek : String, paramName : String, paramTahun : Int) {
    //param di object == construktor
    //initialize block misal mau ada simple action tanpa ada function pada object
    init {
        println("Car $paramMerek dibuat")
    }
    //secondary constructor
    constructor(paramMerek:String, paramName: String): this(paramMerek, paramName, 2020){
        println("secondary construktor 1")
    }
    //secondary constructor
    constructor(paramMerek: String): this(paramMerek, ""){
        println("Secondary constructor 2")
    }

    //Menambahkan properties dari class car
    var Merek : String = paramMerek
    var Tahun : Int = paramTahun

}