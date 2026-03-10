package com.finnimcfinger.basics

fun main() {
    val name : String = "FinniMcFinger"
    println(name)

    // val is immutable
//    name = "Finni McFinger"

    var age : Int = 43
    println(age)
    // var is mutable
    age = 44
    println(age)

    // type inference
    val salary = 30_000L
    println(salary)

    // string interpolation
    println("Hi, I'm $name, and I am $age years old. My name is ${name.length} characters long.")

    var multiline = "ABC\nDEF"
    println(multiline)
    // triple quotation allows preformatted strings, trim indent does what it says
    multiline = """
        ABC
        DEF
    """.trimIndent()
    println(multiline)
    multiline = """
        without
        .trimIndent()
    """
    println(multiline)
}