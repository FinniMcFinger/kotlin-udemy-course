package com.finnimcfinger.exceptions

/*
    Kotlin does not support checked exceptions. ALl exceptions are effectively runtime exceptions.
 */
fun main() {
    val l1 = nameLength("Marty")
    println(l1)
    val l2 = nameLength(null)
    println(l2)
    returnNothing()
}

fun nameLength(name: String?): Int? {
    return try {
        name!!.length
    } catch (e: Exception) {
        println("Exception detected: $e")
        null
    }
}

fun returnNothing(): Nothing {
    throw RuntimeException("exception")
}
