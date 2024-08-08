package com.example.primertarea

fun main() {
    println("Ingrese el primer número:")
    val numero1 = readLine()?.toIntOrNull() ?: 0

    println("Ingrese el segundo número:")
    val numero2 = readLine()?.toIntOrNull() ?: 0

    val suma = numero1 + numero2

    println("La suma de $numero1 y $numero2 es: $suma")
}
