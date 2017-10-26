package com.exhui.kotlin.demo.chapter5

fun alphabet(): String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) {
        for (letter in 'A'..'Z') {
            this.append(letter)
        }
        append("\nNow I know the alphabet")
        this.toString()
    }
}

fun alphabet_() = with(StringBuilder(), {
    for (letter in 'A'..'Z') {
        this.append(letter)
    }
    append("\nNow I know the alphabet")
    toString()
})

fun main(args: Array<String>) {
    println(alphabet())
    println(alphabet_())
}