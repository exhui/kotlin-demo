package com.exhui.kotlin.demo.chapter4

data class Client(val name: String, val postalCode: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client)
            return false
        return name == other.name && postalCode == other.postalCode
    }
    override fun toString(): String = "Client(name=$name, postalCode=$postalCode)"
}

fun main(args: Array<String>) {
    val client1 = Client("Alice", 10086)
    val client2 = Client("Alice", 10086)
    println(client1)
    println(client2)
    println(client1 == client2)
    println(client1 === client2)
    println(client2.copy("Hui"))
}