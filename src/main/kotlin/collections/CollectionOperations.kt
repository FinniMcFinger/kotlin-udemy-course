package com.finnimcfinger.collections

import com.finnimcfinger.dataset.Course
import com.finnimcfinger.dataset.CourseCategory
import com.finnimcfinger.dataset.KAFKA
import com.finnimcfinger.dataset.courseList

// `it` keyword can be used to access the element in a collections operator

fun main() {
    val courses = courseList()
    val developmentPredicate = { c: Course -> c.category == CourseCategory.DEVELOPMENT }
    val designPredicate = { c: Course -> c.category == CourseCategory.DESIGN }
    println("Development Courses:")
    exploreFilter(courses, developmentPredicate)
    println("Design Courses:")
    exploreFilter(courses, designPredicate)
    println("Development Course Names/Categories:")
    exploreMap(courses, developmentPredicate)
    println("Design Course Names/Categories:")
    exploreMap(courses, designPredicate)

    val complexList = listOf(listOf(1, 2, 3), listOf(4, 5, 6))
    val normalResult = complexList.map{ outerList ->
        outerList.map{ it.toDouble() }
    }
    println("normal map result: $normalResult")
    val flatResult = complexList.flatMap{ outerList ->  outerList.map{ it.toDouble() }}
    println("flat map result: $flatResult")

    val kafkaCourses = exploreFlatMap(courses, KAFKA)
    println("kafka courses: $kafkaCourses")
}

fun exploreFilter(courses: MutableList<Course>, predicate: (Course) -> Boolean) {
    courses
        .filter { predicate.invoke(it) }
        .forEach { println(it) }
}

fun exploreMap(courses: MutableList<Course>, predicate: (Course) -> Boolean) {
    courses
        .filter(predicate) // passes predicate directly, no need to invoke
        .map { "${it.name} - ${it.category}" } // returns iterable, forEach refers to the result of .map
        .forEach { println(it) }
}

fun exploreFlatMap(courses: MutableList<Course>, topic: String): List<String> {
    return courses.flatMap { course ->
        val courseName = course.name
        course.topicsCovered.filter {
            it == topic
        } .map { courseName }
    }
}