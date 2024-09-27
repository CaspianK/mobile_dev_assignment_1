package com.example.assignment_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.assignment_1.ui.theme.Assignment_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment_1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }

        // Ex1
        val ex1 = Ex1()
        ex1.main()
        ex1.checkNumber(7)
        ex1.loop()
        ex1.collections()

        // Ex2
        val person = Person("Alibek", 30, "alibek@gmail.com")
        person.details()

        val employee = Employee("Asel", 25, "asel@gmail.com", 500000.0)
        employee.details()

        val bankAccount = BankAccount(1000.0)
        bankAccount.deposit(500.0)
        bankAccount.withdraw(200.0)
        bankAccount.displayBalance()

        // Ex3
        val ex3 = Ex3()
        println("Sum of 5 and 3: ${ex3.sum(5, 3)}")
        println("Product of 5 and 3: ${ex3.multiply(5, 3)}")
        println("Product of 5 and 3 using higher order function: ${ex3.higherOrder(5, 3, ex3.multiply)}")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Assignment_1Theme {
        Greeting("Android")
    }
}