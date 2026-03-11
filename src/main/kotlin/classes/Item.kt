package com.finnimcfinger.classes

// empty primary constructor
class Item() {
    var name: String = ""
    // getters and setters are declared inline with the field
    var price: Double = 0.0
    get() {
        println("inside price getter")

        return field
    }
    set(value) {
        println("inside price setter")

        if (value >= 0.0) field = value
        else throw IllegalArgumentException("value must be greater than 0.0")
    }

    // secondary constructor
    constructor(name: String): this() {
        this.name = name
    }
}

fun main() {
    val item = Item("coffee mug")
    println(item.name)
    // access via getter
    println(item.price)
    // access via setter
    item.price = 10.0
    item.price = -1.0
}