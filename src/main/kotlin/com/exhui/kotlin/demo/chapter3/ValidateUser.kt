package com.exhui.kotlin.demo.chapter3

class UserInfo(val id: Int, val name: String, val address: String)

fun saveUser(user: UserInfo) {
    if (user.name.isBlank()) {
        throw IllegalArgumentException("Can't save user ${user.id}: empty Name")
    }
    if (user.address.isBlank()) {
        throw IllegalArgumentException("Can't save user ${user.id}: empty Address")
    }
}

fun saveUser_(user: UserInfo) {
    fun validate(user: UserInfo, value: String, fieldName: String) {
        if(value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
        }
    }
    validate(user, user.name, "Name")
    validate(user, user.address, "Address")
}

fun main(args: Array<String>) {
//    saveUser(UserInfo(1, "", ""))
    saveUser_(UserInfo(1, "", ""))
}
