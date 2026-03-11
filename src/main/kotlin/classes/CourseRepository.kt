package com.finnimcfinger.classes

// interface functions are open by default
interface CourseRepository {
    // abstract function
    fun getById(id: Int): Course

    // non-abstract function
    fun save(course: Course): Int {
        println("saving course")

        return course.id
    }
}

interface Repository {
    fun getAll()
}

//                          ↓ implements the interface
class SqlCourseRepository : CourseRepository {
    override fun getById(id: Int): Course {
        return Course(
            id = id,
            name = "Course $id",
            author = "Doc Brown"
        )
    }

    // You can override non-abstract functions
    override fun save(course: Course): Int {
        println("overridden save")

        return super.save(course)
    }
}

//                                              ↓ multiple interface inheritance
class NoSqlCourseRepository : CourseRepository, Repository {
    override fun getById(id: Int): Course {
        return Course(
            id = id,
            name = "Course $id",
            author = "Doc Brown"
        )
    }

    override fun getAll() {
        println("NoSqlCourseRepository overridden getAll")
    }
}

fun main() {
    val sqlRepo = SqlCourseRepository()
    val course = sqlRepo.getById(1)
    println(course)
    sqlRepo.save(course)
    val noSqlRepo = NoSqlCourseRepository()
    val otherCourse = sqlRepo.getById(2)
    println(otherCourse)
    noSqlRepo.save(otherCourse)
    noSqlRepo.getAll()
}