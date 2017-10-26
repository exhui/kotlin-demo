package com.exhui.kotlin.demo.chapter5

fun salute() = println("Salute!")

fun main(args: Array<String>) {
    run(::salute)
    println("Main")

    val createPerson = :: Person
    val p = createPerson("Alice", 18)
    println(p)
}