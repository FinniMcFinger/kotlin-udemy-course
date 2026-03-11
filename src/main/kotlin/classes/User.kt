package com.finnimcfinger.classes

// `open` un-finalizes the class and allows it to be extended
open class User(val name: String) {
    var isLoggedIn = false
    open var title = "User"

    open fun login() {
        println("User base class login")
        this.isLoggedIn = true
    }
}

//                           ↓ extends User
class Student(name: String): User(name) {
    // overriding the `title` field from `User`
    override var title = "Student"

    // overriding the login function from `User`
    override fun login() {
        println("Student class login")
        super.login()
    }

    // provides interfaces for static access
    companion object {
        const val MAX_COURSE_COUNT = 10
        fun country() = "USA"
    }
}

class Instructor(name: String): User(name) {
    override var title = "Instructor"
}

fun main() {
    val user = User("Nobody")
    user.login()
    println("${user.title} ${user.name} logged in? ${user.isLoggedIn}")
    val student = Student("Marty")
    student.login()
    println("${student.title} ${student.name} logged in? ${student.isLoggedIn}")
    println(Student.MAX_COURSE_COUNT)
    println(Student.country())
    val instructor = Instructor("Doc")
    instructor.login()
    println("${instructor.title} ${instructor.name} logged in? ${instructor.isLoggedIn}")
}