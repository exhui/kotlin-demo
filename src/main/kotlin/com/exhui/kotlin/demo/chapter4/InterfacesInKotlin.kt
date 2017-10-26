package com.exhui.kotlin.demo.chapter4

interface Clickable {
    fun click()
}

class Button: Clickable {
    override fun click() {
        println("I was clicked")
    }
}

fun main(args: Array<String>) {
    Button().click()
}

