package com.finnimcfinger.scopefunctions

import com.finnimcfinger.classes.Course
import com.finnimcfinger.classes.CourseCategory

// see all scope function docs: https://kotlinlang.org/docs/scope-functions.html

fun main() {
    // extension functions
    exploreApply()
    exploreAlso()
    exploreLet()
    // non-extension functions
    exploreWith()
    // both
    exploreRun()
}

// `apply` is used to configure an object; uses `this`, but may also not need to reference it
fun exploreApply() {
    val course = Course(1,
        "Primitive Hoverboard Designs",
        "Marty McFly"
    ).apply {
        category = CourseCategory.DESIGN
    }

    println(course)
}

// `also` is used to apply additional or side effect functionality (i.e. post-construct); uses `it`
fun exploreAlso() {
    val course = Course(1,
        "Primitive Hoverboard Designs",
        "Marty McFly"
    ).also {
        it.category = CourseCategory.DESIGN
        println(it)
    }
}

// `let` returns the lambda result; uses `it`
fun exploreLet() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    val result = numbers.map { it * 2 }.filter { it > 5 }.let {
        println(it)
        it.sum()
    }
    println(result)

    var name: String? = null
    var upperCaseName = name?.let {
        println(it)
        it.uppercase()
    }
    println(upperCaseName)
    name = "Marty"
    upperCaseName = name?.let {
        println(it)
        it.uppercase()
    }
    println(upperCaseName)
}

// `with` returns the lambda result; uses `this`
fun exploreWith() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    var result = with(numbers) {
        println(this)
        this.sum()
    }
    println(result)
}

// `run` is useful when lambda contains both initialization and computation of return value
// uses `this` when run as an extension; no object reference when ran as non-extension
fun exploreRun() {
    var numbers = mutableListOf(1, 2, 3)
    val result = numbers.run {
        this.sum()
    }
    println(result)

    // `run` as non-extension
    val hexNumberRegex = run {
        val digits = "0-9"
        val hexDigits = "A-Fa-f"
        val sign = "+-"

        Regex("[$sign]?[$digits$hexDigits]+")
    }

    for (match in hexNumberRegex.findAll("+123 -FFFF !%*& 88 XYZ")) {
        println("hex decimal value: ${match.value.toInt(16)}")
    }
}