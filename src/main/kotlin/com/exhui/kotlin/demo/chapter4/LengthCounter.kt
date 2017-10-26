package com.exhui.kotlin.demo.chapter4

class LengthCounter {
    var counter: Int = 0
        //private set

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main(args: Array<String>) {
    val lengthCounter = LengthCounter()
    lengthCounter.counter = 1
    lengthCounter.addWord("Hi!")
    println(lengthCounter.counter)
}