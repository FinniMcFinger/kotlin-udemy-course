package com.finnimcfinger.classes

// empty primary constructor
class Item() {
    var name: String = ""

    // secondary constructor
    constructor(name: String): this() {
        this.name = name
    }
}

fun main() {
    val item = Item("coffee mug")
    println(item.name)
}