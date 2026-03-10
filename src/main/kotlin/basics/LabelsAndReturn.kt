package com.finnimcfinger.basics

fun main() {
    for (i in 1..5) {
        println("i is $i")

        if (i == 3) break
    }

    label()

    // return causes the function to return, so the `println` at the end will not happen
    for (i in 1..5) {
        println("i is $i")

        if (i == 3) return
    }

    println("END")
}

fun label() {
    // creates a label named `loop` for ease of reference and documentation
    loop@ for (i in 1..5) {
        println("i (label) is $i")

        innerLoop@ for (j in 1..5) {
            println("j (label) is $j")
            // breaks the OUTER loop
//            if (j == 2) break@loop
            // continues OUTER loop
            if (j == 2) continue@loop
        }
    }
}