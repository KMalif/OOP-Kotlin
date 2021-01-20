package app

import data.User

fun main() {

    val user1 = User("Admin", "Secret_password")
    val user2 = User("Admin2", "Secret_password2")

    println(user1.username)
    println(user1.password)
}