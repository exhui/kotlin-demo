package com.exhui.kotlin.demo.chapter3

class Point(val x: Int, val y: Int) {
    override fun toString(): String {
        return "x:$x, y:$y"
    }
}

operator fun Point.unaryMinus() = Point(-x, -y)
operator fun Point.not() = Point(-1, -1)

data class Counter(val dayIndex: Int) {
    operator fun plus(increment: Int): Counter {
        return Counter(dayIndex + increment)
    }
}

fun main(args: Array<String>) {
    val point = Point(10, 20)
    println(-point)
    println(!point)
    println(Counter(1).plus(1).toString())
}