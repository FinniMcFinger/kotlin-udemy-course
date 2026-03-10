package com.finnimcfinger.basics

fun main() {
    var name = "Finni"
//    name = "McFinger"

    if (name.length == 5) {
        println("name is 5 characters")
    } else {
        println("name length is not 5 characters")
    }

    // if-else can be turned into a Unit with a return; the `name` invocation at the end of each block returns it
    val result = if (name.length == 5) {
        println("name is 5 characters")
        name
    } else {
        println("name length is not 5 characters")
        name
    }

    println("result: $result")

    // Unit in action
    var position = 3

    val medal = if (position == 1) {
        "GOLD"
    } else if (position == 2) {
        "SILVER"
    } else if (position == 3) {
        "BRONZE"
    } else {
        "NO MEDAL"
    }

    // should print `BRONZE`
    println(medal)

    // when block is like a switch in Java
    position = 4
    val medalWhen = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }

    // should print `NO MEDAL`
    println(medalWhen)
}