package com.exhui.kotlin.demo.chapter6

fun showProgress(progress: Int) {
    val percent = progress.coerceIn(0, 100)
    println("We're $percent% done")
}


fun Int.coerceIn_(minimumValue: Int, maximumValue: Int): Int {
    return 200
}

fun main(args: Array<String>) {
    showProgress(146)
    println(1.coerceIn_(0, 1000))
}