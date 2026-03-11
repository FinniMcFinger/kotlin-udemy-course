package com.finnimcfinger.cast

import com.finnimcfinger.classes.Course

fun main() {
    val course = Course(1, "Course 1", "Doc Brown")
    checkType(course)
    checkType(course.author)
    castNumber(1.0)
    castNumber(1)
    castNumber("2") // no ClassCastException due to ? use
}

fun checkType(target: Any) {
    when (target) {
        is Course -> println("target is a Course: $target")
        is String -> println("target is a String: $target")
    }
}

fun castNumber(target: Any) {
    when (target) {
        // ? - safe operator only allows the cast to happen if it is possible
        target as? Double -> println("cast as a Double")
        target as? Int -> println("cast as a Int")
    }
}