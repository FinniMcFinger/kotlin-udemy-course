package com.finnimcfinger.nulls

data class Movie(
    var id: Int?,
    val name: String
)

fun main() {
    var nullable: String? = null
    println("nullable value is $nullable")
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
    val movie = Movie(null, "Back to the Future")
    println("movie is $movie")
    saveMovie(movie)
    // !! - non-null assertion, should result in NPE
    println(movie.id!!)
    println("movie is $movie")
}

fun saveMovie(movie: Movie) {
    movie.id = null
}