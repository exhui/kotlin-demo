package com.exhui.kotlin.demo.chapter3

fun main(args: Array<String>) {
    println("12.345-6.A_B".split("\\.|-|_".toRegex()))
    println("12.345-6.A_B".split(".", "-", "_"))
}