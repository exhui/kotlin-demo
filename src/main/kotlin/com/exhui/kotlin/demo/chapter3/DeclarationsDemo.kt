package com.exhui.kotlin.demo.chapter3

data class MyTest(val x: Int, val y: Int, val z: Int)

fun main(args: Array<String>) {
    val (x, y, z) = MyTest(10, 20, 30)
    println("x:${x},x:${y},x:${z}")
    val result = MyTest(10, 20, 30)
    println(result)
}