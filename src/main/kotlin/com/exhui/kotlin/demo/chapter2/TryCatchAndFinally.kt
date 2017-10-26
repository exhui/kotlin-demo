package com.exhui.kotlin.demo.chapter2

import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader: BufferedReader): Int? {
    var num = 0
    try {
        val line = reader.readLine()
        num = Integer.parseInt(line)
    }
    catch (e: NumberFormatException) {

    }
    finally {
        reader.close()
        return num
    }
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("1234"))
    println(readNumber(reader))
}