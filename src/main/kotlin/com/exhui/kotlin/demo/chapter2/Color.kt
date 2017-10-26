package com.exhui.kotlin.demo.chapter2

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun getMnemonic(color: Color): String {
    return when (color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN, Color.BLUE  -> "Gave And Battle"
    }
}

fun main(args: Array<String>) {
    println(Color.RED.rgb())
    println(getMnemonic(Color.BLUE))
}