package com.exhui.kotlin.demo.chapter5

fun main(args: Array<String>) {
    val sum = { x: Int, y: Int -> x + y }
    println(sum(1, 2))
//    { println(31)}()
    run { println(1) }

    val peoples = listOf(Person("Alice", 29), Person("Bob", 31))
    val names = peoples.joinToString(separator = "", transform = {p: Person -> p.name})
    println(names)
}