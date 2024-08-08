package com.example.primertarea

fun main() {
    println("Ingrese un número entero:")
    val num = readLine()?.toIntOrNull() ?: 0

    // Verificamos si el número es divisible por 10
    if (num % 10 == 0) {
        println("Divisible.")
    } else {
        println("No divisible.")
    }
}
