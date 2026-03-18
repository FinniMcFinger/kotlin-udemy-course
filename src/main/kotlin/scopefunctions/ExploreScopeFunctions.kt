package com.finnimcfinger.scopefunctions

import com.finnimcfinger.classes.Course
import com.finnimcfinger.classes.CourseCategory

// see all scope function docs: https://kotlinlang.org/docs/scope-functions.html

fun main() {
    exploreApply()
}

fun exploreApply() {
    val course = Course(1,
        "Primitive Hoverboard Designs",
        "Marty McFly"
    ).apply {
        category = CourseCategory.DESIGN
    }

    println(course)
}