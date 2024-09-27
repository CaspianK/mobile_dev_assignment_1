package com.example.assignment_1

class Ex3 {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    val multiply: (Int, Int) -> Int = { a, b -> a * b }

    fun higherOrder(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }
}