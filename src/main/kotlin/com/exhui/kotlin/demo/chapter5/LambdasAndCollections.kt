package com.exhui.kotlin.demo.chapter5

data class Person(val name: String, val age: Int)

fun findTheOldest(peoples: List<Person>): Person? {
    var maxAge = 0
    var theOldest: Person? = null
    for (person in peoples) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }
    return theOldest
}

fun main(args: Array<String>) {
    val peoples = listOf(Person("Alice", 29), Person("Bob", 31))
    println(findTheOldest(peoples))
    println(peoples.maxBy { it.age })
}

