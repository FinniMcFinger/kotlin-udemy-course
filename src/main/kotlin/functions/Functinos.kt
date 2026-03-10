package com.finnimcfinger.functions

// Unit serves as the void type does in Java; declaring it is redundant as it is inferred
fun printName(name: String) {
    println("Name: $name")
}

// function with multiple params and a return type
fun addition(i: Int, j: Int): Int {
    return i + j
}

// another way to declare functions, as statements; type inferred
fun additionCompact(i: Int, j: Int) = i + j

fun main() {
    // passing a param
    val unit = printName("Finni McFinger")
    println("unit is of type: $unit")
    println("calling addition of 3 and 4: ${addition(3, 4)}")
    println("calling compact addition of 3 and 4: ${additionCompact(3, 4)}")
}