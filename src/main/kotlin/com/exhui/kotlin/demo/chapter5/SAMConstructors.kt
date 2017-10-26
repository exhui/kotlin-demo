package com.exhui.kotlin.demo.chapter5

fun createAllDoneRunnable(): Runnable {
    return Runnable { println("All Done!") }
}

fun main(args: Array<String>) {
    createAllDoneRunnable().run()
}