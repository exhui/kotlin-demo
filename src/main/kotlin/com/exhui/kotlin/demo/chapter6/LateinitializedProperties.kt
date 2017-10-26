package com.exhui.kotlin.demo.chapter6

class MyService {
    fun performance(): String = "foo"
}

class MyTest {
    private var myService: MyService? = null

    fun setUp() {
        myService = MyService()
    }

    fun testAction () {
        myService?.performance()
    }
}

fun main(args: Array<String>) {
    println(MyTest().testAction())
}