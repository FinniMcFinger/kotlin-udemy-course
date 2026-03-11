package com.finnimcfinger.cast

import com.finnimcfinger.classes.Course

fun main() {
    val course = Course(1, "Course 1", "Doc Brown")
    checkType(course)
    checkType(course.author)
    castNumber(1.0)
    castNumber(1) // ClassCastException
    castNumber("2") // ClassCastException
}

fun checkType(target: Any) {
    when (target) {
        is Course -> println("target is a Course: $target")
        is String -> println("target is a String: $target")
    }
}

fun castNumber(target: Any) {
    when (target) {
        target as Double -> println("cast as a Double")
    }
}