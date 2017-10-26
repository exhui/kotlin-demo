package com.exhui.kotlin.demo.chapter3

open class View {
    open fun click() = println("View Clicked")
}

class Button: View() {
    override fun click() = println("Button Clicked")
}

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")

fun main(args: Array<String>) {
    val view: View = Button()
    val view_ = View()
    val button = Button()
    view.click()
    view.showOff()
    view_.showOff()
    button.showOff()
}