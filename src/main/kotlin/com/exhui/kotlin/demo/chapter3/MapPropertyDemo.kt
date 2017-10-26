package com.exhui.kotlin.demo.chapter3

class User(map: Map<String, Any?>) {
//    val name: String = map.getValue("name") as String
    val name: String by map
    val age: Int     by map
}

fun main(args: Array<String>) {
    val user = User(mapOf("name" to "hui", "age" to 18))
    println("user.name:${user.name}, user.age:${user.age}")
}