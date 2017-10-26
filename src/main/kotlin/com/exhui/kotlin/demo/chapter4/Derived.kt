package com.exhui.kotlin.demo.chapter4

open class Derived: Base() {
    open val name: String get() = ""

    override fun sayHello() {
        super.sayHello()
    }

    final override fun getName() {
        super.getName()
    }
}