package com.exhui.kotlin.demo.chapter2

fun isLetter(char: Char) = char in 'a'..'z' || char in 'A'..'Z'
fun isNotDight(char: Char) = char !in  '0'..'9'

fun main(args: Array<String>) {
    println(isLetter('q'))
    println(isNotDight('x'))
}