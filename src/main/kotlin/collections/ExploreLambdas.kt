package com.finnimcfinger.collections

fun main() {
    // no type inference for lambdas
    val doubleLambda = { x: Int -> x + x}
    println(doubleLambda(1))
    // last statement in multiline lambda is what gets returned
    val multiplyLambda = { x: Int, y: Int ->
        println("x is $x, y is $y")
        x * y
    }
    println(multiplyLambda(2, 6))
    // invoking higher order function
    // inline lambdas that are final argument can be passed outside parentheses
    val result = calculate(2, 6) { x, y -> x + y}
    println(result)
    // you can pass in predefined lambdas
    val addTwoLambda = { x: Int, y: Int -> x + y }
    val addition = calculate(2, 6, addTwoLambda)
    println(addition)
    val multiply = calculate(2, 4, multiplyLambda)
    println(multiply)
}

// higher order function that accepts a function as an argument
fun calculate(x: Int, y: Int, operation: (x: Int, y: Int)-> Int): Int {
    return operation(x,y)
}