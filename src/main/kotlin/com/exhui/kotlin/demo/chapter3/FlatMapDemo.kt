package com.exhui.kotlin.demo.chapter3

fun main(args: Array<String>) {
    val list = listOf(1, 2, 4, 10).flatMap {  }
//    val result = listOf("abc", "12").flatMap { it.toCharList() }
}

private fun <E> List<E>.flatMap(transform: (E) -> Unit): Any {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}
