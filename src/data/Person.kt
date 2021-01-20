package data

class Person {
    //Menambahkan properties dari class person
    var firstName : String = ""
    var middleName : String? = null
    var lastName : String = ""

    fun sayHello(name:String){
        println("Hello $name, My Name is Alif")
    }

    //this keyword untuk mengambil properties firstName
    fun sayHello(firstName:String, lastName : String){
        println("Hello $firstName $lastName, My Name is ${this.firstName}")
    }



    fun learn(){
        println("I Learn Kotlin OOP")
    }

    fun getFullName():String{
        return "$firstName $middleName $lastName"
    }
}


