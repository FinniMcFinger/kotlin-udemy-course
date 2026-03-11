package com.finnimcfinger.classes

data class Employee(
    var id: Int,
    var name: String
)

fun main() {
    val employee = Employee(0, "John Smith")
    println(employee)
    val employee2 = employee.copy()
    println(employee == employee2)
    val employee3 = employee.copy(id=1)
}