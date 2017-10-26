package com.exhui.kotlin.demo.chapter6

fun verifyUserInput(input: String?) {
    if(input.isNullOrBlank()) {
        println("Please fill in the required fields")
    } else {
        println("$input")
    }
}

fun main(args: Array<String>) {
    verifyUserInput("")
    verifyUserInput(null)
    verifyUserInput("null")
}