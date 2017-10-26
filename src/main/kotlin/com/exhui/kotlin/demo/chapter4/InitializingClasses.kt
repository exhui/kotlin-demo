package com.exhui.kotlin.demo.chapter4

fun getFacebookName(accountId: Int) = "fb:$accountId"

interface User {
    val nickname: String
}

interface UserInfo {
    val email: String
    val nickname: String
        get() = email.substringBefore("@")
}

class PrivateUser(override val nickname: String) : User

class SubscribingUser(val email: String) : User {
    override val nickname: String
        get() = email.substringBefore("@")
}

class FacebookUser(val accountId: Int) : User {
    override val nickname: String
        get() = getFacebookName(accountId)
}

fun main(args: Array<String>) {
    println(PrivateUser("test@kotlinlang.org").nickname)
    println(SubscribingUser("test@kotlinlang.org").nickname)
    println(FacebookUser(1).nickname)
}
