package com.finnimcfinger.collections

import com.finnimcfinger.dataset.Course
import com.finnimcfinger.dataset.CourseCategory
import com.finnimcfinger.dataset.courseList

/*
    Sequences evaluate collections lazily. This is good for larger collections because intermediate objects are not
    created during evaluations. To operate as a sequence, the `.asSequence()` invocation must be made before operations,
    and a terminal operation, such as `.toList()` must be called.
 */
fun main() {
    val names = listOf("marty", "doc", "biff", "jennifer")
    println("all names: $names")
    val longNames = names.asSequence()
        .filter { it.length > 4 }
        .map { it.uppercase()}
        .toList()
    println("long names: $longNames")

    val developmentPredicate = { c: Course -> c.category == CourseCategory.DEVELOPMENT }
    exploreFilterSequenced(courseList(), developmentPredicate)

    val range = 1..1_000_000_000
    range
        .asSequence() // without this, likely to get an OutOfMemoryError
        .take(40) // takes just the first 40
        .map { it.toDouble() } // stores in intermediate list object if not run as sequence
        .forEach { println(it) }
}

fun exploreFilterSequenced(courses: MutableList<Course>, predicate: (Course) -> Boolean) {
    courses.asSequence()
        .filter(predicate)
        .forEach { println(it) }
}