package com.finnimcfinger.classes

/*
    `object` is the equivalent of a singleton in Java. Its functions are referred to like static methods in Java.
    `object` classes cannot have constructor parameters.
 */
object Authenticate {
    fun authenticate(username: String, password: String) {
        println("$username logged in with password of ${password.length} characters")
    }
}

fun main() {
    Authenticate.authenticate("marty", "This is heavy!")
}