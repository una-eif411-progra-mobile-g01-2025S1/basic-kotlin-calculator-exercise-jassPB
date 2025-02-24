package org.example

fun main() {
    val calculator = Calculator()
    val sum = calculator.add(5.0, 3.0)      // Returns 8.0
    println("Sum: $sum")
    val difference = calculator.subtract(10.0, 4.0)  // Returns 6.0
    println("Difference: $difference")
    val product = calculator.multiply(2.0, 3.0)    // Returns 6.0
    println("Product: $product")
    val quotient = calculator.divide(10.0, 2.0)    // Returns 5.0
    println("Quotient: $quotient")
}