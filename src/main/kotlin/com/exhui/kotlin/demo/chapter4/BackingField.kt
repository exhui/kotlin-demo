package com.exhui.kotlin.demo.chapter4

class People(val name: String) {
    var address = "unspecified"
        set(value) {
            println(""" Address was changed for $name: "$field" -> "$value".""".trimIndent())
            field = value
        }
}

fun main(args: Array<String>) {
    val people = People("Alice")
    people.address = "Elsenheimerstrasse 47, 80687 Muenchen"
}