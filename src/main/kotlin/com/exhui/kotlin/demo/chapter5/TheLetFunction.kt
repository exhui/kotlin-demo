package com.exhui.kotlin.demo.chapter5

fun sendEmailTo(email: String) {
    println("Sending email to $email")
}

fun main(args: Array<String>) {
    var email: String? = "example@exhui.com"
    email?.let { sendEmailTo(it)}
    email = null
    email?.let { sendEmailTo(it) }
}