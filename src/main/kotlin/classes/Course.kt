package com.finnimcfinger.classes

// declaring a class as data generates equals(), hashCode(), and toString() for the class; requires primary constructor
data class Course(
    val id: Int,
    val name: String,
    val author: String,
    val category: CourseCategory = CourseCategory.DEVELOPMENT
)

enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

fun main() {
    val course1 = Course(1, "Course Name", "Marty McFly")
    println(course1)
    val course2 = Course(1, "Course Name", "Marty McFly")
    println("courses equal? ${course1 == course2}")
    /*
        `copy()` allows for changing of field values in the new instance. `copy()` has the same pitfalls as
        `Object.copy()` does in Java.
     */
    val course3 = course1.copy(id = 3)
    println(course3)
    val businessCourse = Course(2, "Somehow I Manage", "Michael G. Scott", CourseCategory.BUSINESS)
    println(businessCourse)
}