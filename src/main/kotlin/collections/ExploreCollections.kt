package com.finnimcfinger.collections

fun main() {
    /* Lists */
    // immutable
    val letters = listOf("A", "B", "C")
    println(letters)
    // mutable
    val lettersMutable = mutableListOf("D", "E", "F")
    println(lettersMutable)
    lettersMutable.add("G")
    println(lettersMutable)

    /* Sets */
    val names = setOf("Alex", "Bobby", "Chris")
    println(names)
    val namesMutable = mutableListOf("Derek", "Eddie", "Frank")
    println(namesMutable)
    namesMutable.add("George")
    println(namesMutable)

    /* Hash Maps */
    val nameAndAge = mapOf("Alex" to 34, "Bobby" to 32, "Chris" to 12)
    println(nameAndAge)
    val nameAndAgeMutable = mutableMapOf("Derek" to 40, "Eddie" to 61, "Frank" to 47)
    println(nameAndAgeMutable)
    nameAndAgeMutable["George"] = 27
    println(nameAndAgeMutable)
}