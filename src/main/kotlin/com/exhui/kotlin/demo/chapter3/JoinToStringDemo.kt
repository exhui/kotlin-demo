package com.exhui.kotlin.demo.chapter3

fun main(args: Array<String>) {
    val numList = listOf(1, 2, 3, 10)
    println(numList.joinToString(separator = "; ", prefix = "(", postfix = ")"))
    println(numList.joinToString(","))
    val stringList = listOf("one", "two", "three")
    println(stringList.join(" "))
}

fun Collection<String>.join(separator: String = ", ", prefix: String = "", postfix: String = "") = joinToString(separator, prefix, postfix)

