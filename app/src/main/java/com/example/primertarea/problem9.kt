package com.example.primertarea

fun main() {
    println("Ingrese el primer número:")
    val num1 = readLine()?.toIntOrNull() ?: 0

    println("Ingrese el segundo número:")
    val num2 = readLine()?.toIntOrNull() ?: 0

    // Comparamos num1 con el doble de num2
    if (num1 > 2 * num2) {
        println("Wow!")
    } else {
        println("Aburrido!")
    }
}
