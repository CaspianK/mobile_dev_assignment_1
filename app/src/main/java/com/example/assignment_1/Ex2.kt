package com.example.assignment_1

open class Person(
    private val name: String,
    private val age: Int,
    private val email: String
) {
    open fun details() {
        println("Name: $name")
        println("Age: $age")
        println("Email: $email")
    }
}

class Employee(
    name: String,
    age: Int,
    email: String,
    private val salary: Double
) : Person(name, age, email) {
    override fun details() {
        super.details()
        println("Salary: $salary")
    }
}

class BankAccount(private var balance: Double) {
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited: $amount, New Balance: $balance")
        } else {
            println("Deposit amount must be positive.")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Withdrew: $amount, New Balance: $balance")
        } else {
            println("Insufficient balance or invalid amount.")
        }
    }

    fun displayBalance() {
        println("Current Balance: $balance")
    }
}