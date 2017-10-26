package com.exhui.kotlin.demo.chapter3

fun main(args: Array<String>) {
    val arr = arrayOf(1, 2, 3)
    val list = listOf("args:", arr)
    val list_ = listOf("args:", *arr)
    println(list)
    println(list_)
}