package com.exhui.kotlin.demo.chapter3

class ExtensionFunctionDemo {
    fun foo() { println("member") }
}

fun ExtensionFunctionDemo.foo() {
    println("extension")
}

fun main(args: Array<String>) {
    println(ExtensionFunctionDemo().foo())
}