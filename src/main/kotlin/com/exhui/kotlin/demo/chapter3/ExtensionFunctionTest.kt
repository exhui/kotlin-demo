package com.exhui.kotlin.demo.chapter3

open class C

class D: C()

fun C.foo() = "c"

fun D.foo() = "d"

fun printFoo(c: C) {
    println(c.foo())
    println(C().foo())
    println(D().foo())
}

fun main(args: Array<String>) {
    printFoo(D())
}