package com.exhui.kotlin.demo.chapter6

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

fun main(args: Array<String>) {
    fail("Error occurred")
}