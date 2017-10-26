package com.exhui.kotlin.demo.chapter3

val String.lastChar: Char
    get() = get(length - 1)
var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

fun main(args: Array<String>) {
    println("kotlin".lastChar)
    val sb = StringBuilder("kotlin?")
    sb.lastChar = '!'
    println(sb)
}