package com.exhui.kotlin.demo.chapter3

fun String.lastChar(): Char = this.get(this.length - 1)
fun String.println(): String{
    println(this)
    return this
}

fun main(args: Array<String>) {
    println("kotlin".println().lastChar())
}