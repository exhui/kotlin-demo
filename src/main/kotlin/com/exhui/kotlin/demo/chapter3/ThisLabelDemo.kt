package com.exhui.kotlin.demo.chapter3

class A {
    inner class B {

        init {
            1.foo()
        }

        fun Int.foo() {
            val a = this@A
            println(a)
            val b = this@B
            println(b)
            val c = this
            println(c)
            val c1 = this@foo
            println(c1)
//            val funList = fun String.() {
//                val d = this
//                println(d)
//            }
//            println(funList)
        }

        override fun toString(): String {
            return "B"
        }
    }

    override fun toString(): String {
        return "A"
    }
}

fun main(args: Array<String>) {
    A().B()
}