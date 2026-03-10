package com.finnimcfinger.functions

// const tags the value to be used across the project
const val topLevelProperty = "This is a top level property."

fun topLevelFunction(): Int {
    return (0..100).random()
}

fun main() {
    val num = topLevelFunction()
    println(num)
    print(topLevelProperty)
}