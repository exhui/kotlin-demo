package com.exhui.kotlin.demo.chapter6

fun foo(l: Long) = println(l)

fun main(args: Array<String>) {
    val list = listOf(1L, 2L, 3L)
    val x = 1
    println(x.toLong() in list)

    val b: Byte = 1
    val l = b + 1L
    println(l in list)

    foo(42)

    println("42".toInt())
}