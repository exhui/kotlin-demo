package com.exhui.kotlin.demo.chapter2

import java.util.*

class Rectangle(private val height: Int, private val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}

fun main(args: Array<String>) {
    println(Rectangle(41, 42).isSquare)
    println(Rectangle(41, 41).isSquare)
    println(Rectangle(Random().nextInt(), Random().nextInt()).isSquare)
}