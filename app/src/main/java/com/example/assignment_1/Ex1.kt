package com.example.assignment_1

class Ex1 {
    fun main() {
        val myInt: Int = 7
        val myDouble: Double = 7.7
        val myString: String = "Hello, Seven!"
        val myBoolean: Boolean = true

        println("Integer: $myInt")
        println("Double: $myDouble")
        println("String: $myString")
        println("Boolean: $myBoolean")
    }

    fun checkNumber(number: Int) {
        if (number > 0) {
            println("$number is positive")
        } else if (number < 0) {
            println("$number is negative")
        } else {
            println("$number is zero")
        }
    }

    fun loop() {
        println("Using for loop:")
        for (i in 1..10) {
            println(i)
        }

        println("Using while loop:")
        var i = 1
        while (i <= 10) {
            println(i)
            i++
        }
    }

    fun collections() {
        val numbers = listOf(1, 2, 3, 4, 5)
        var sum = 0

        for (number in numbers) {
            sum += number
        }

        println("Sum of all numbers: $sum")
    }
}