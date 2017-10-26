package com.exhui.kotlin.demo.chapter5

import java.io.File

fun File.isInsideHiddenDirectory() = generateSequence(this) { it.parentFile }.any { it.isHidden }

fun main(args: Array<String>) {
    listOf(1, 2, 3, 4).asSequence().map {
        print("map($it)")
        it * it
    }.filter {
        print("filter($it)")
        it % 2 == 0
    }.toList()

    //创建序列，规则是累加
    val natureNumbers = generateSequence(0) { it + 1 }
    //直到序列等于100
    val numbersTo100 = natureNumbers.takeWhile { it <= 100 }
    println(numbersTo100.map { it + 1 }.toList())

    val file = File("/Users/chenyonghui")
    print(file.isInsideHiddenDirectory())
}