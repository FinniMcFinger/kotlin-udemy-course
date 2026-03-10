package com.finnimcfinger.basics

fun main() {
    // range of values 1 to 10
    val range = 1..10

    for (i in range) {
        println("range value: $i")
    }

    // range in reverse
    val reverse = 10 downTo 1

    for (i in reverse) {
        println("reverse value: $i")
    }

    // skipping values
    for (i in reverse step 2) {
        println("reverse value with skip: $i")
    }

    exploreWhile()
    exploreDoWhile()
}

fun exploreWhile() {
    var x = 1;

    while (x < 5) {
        println("value of x is ${x++}")
    }
}

fun exploreDoWhile() {
    var y = 0

    do {
        println("value of y is ${y++}")
    } while (y < 5)
}