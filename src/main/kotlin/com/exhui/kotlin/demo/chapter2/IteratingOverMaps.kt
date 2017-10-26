package com.exhui.kotlin.demo.chapter2

import java.util.*

fun main(args: Array<String>) {
    val binaryReps = TreeMap<Char, String>()

    for (c in 'A' .. 'F') {
        val binary = Integer.toBinaryString(c.toInt())
//        println(c)
//        println(c.toInt())
//        println(binary)
//        binaryReps[c] = binary
        binaryReps.put(c, binary)
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}