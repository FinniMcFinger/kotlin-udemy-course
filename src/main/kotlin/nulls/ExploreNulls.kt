package com.finnimcfinger.nulls

data class Movie(
    var id: Int?,
    val name: String
)

fun main() {
    var nullable: String? = null
    println("nullable value is $nullable")
    // nullable type builds compile error without non-null assertion (!!)
//    printName(nullable!!) // causes NPE
    nullable?.run { printName(this) } // null-safe lambda to run with nullable value, scope function
    // ?  - null-safe operator
    // ?: - Elvis operator, provides default
    val length = nullable?.length ?: 0
    println("demo of null-safe invocation: ${length}")
    nullable = "not null string here"
    println("nullable value is $nullable")
    var nonNullable: String = "some string"
    println("non-nullable value is $nonNullable")
    // compilation error
//    nonNullable = null
    // totally fine
    printName(nonNullable)
    val movie = Movie(null, "Back to the Future")
    println("movie is $movie")
    saveMovie(movie)
    // !! - non-null assertion, should result in NPE
    println(movie.id!!)
    println("movie is $movie")
}

fun saveMovie(movie: Movie) {
    movie.id = 1
}

fun printName(name: String) {
    println("Name: $name")
}

fun printNameNullSafe(name: String?) {
    println("Name: $name")
}