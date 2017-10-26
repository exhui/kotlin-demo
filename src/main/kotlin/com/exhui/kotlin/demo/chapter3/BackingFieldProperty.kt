package com.exhui.kotlin.demo.chapter3

var counter = 0
    set(value) {
        if (value >= 0) {
            field = value
        }
    }

var counter_ = 0
var propertyWithCounter: Int? = null
    set(value: Int?) {
        field = value
        counter_++
    }

fun main(args: Array<String>) {
    counter = -10
    println(counter)
}

