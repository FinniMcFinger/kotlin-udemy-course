package com.finnimcfinger.classes

// declaring the class this way generates a primary constructor with name and age values
class Person(val name: String = "A person", val age: Int = 0) {
    var email: String = ""
    var nameLength: Int = 0

    // secondary constructor w/ arguments
    constructor(name: String = "", age: Int = 0, email: String): this(name, age) {
        this.email = email
    }

    // init block runs after initialization
    init {
        println("init")
        nameLength = name.length
        println("name length: $nameLength")
    }

    fun action() {
        println("$name does an action")
    }

    fun age() {
        println("$name is $age-years old")
    }
}

fun main() {
    val person = Person("Finni McFinger", 44)
    println("${person.name} is the person")
    person.action()
    person.age()
    val person2 = Person()
    person2.action()
    person2.age()
    val person3 = Person(name = "John Public", age = 35, email = "example@example.com")
    println(person3.email);
}