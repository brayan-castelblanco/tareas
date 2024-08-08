package com.example.primertarea

fun main() {
    println("Ingrese el primer número:")
    val num1 = readLine()?.toIntOrNull() ?: 0

    println("Ingrese el segundo número:")
    val num2 = readLine()?.toIntOrNull() ?: 0

    println("Ingrese el tercer número:")
    val num3 = readLine()?.toIntOrNull() ?: 0

    // Contamos los números iguales
    var iguales = 0
    if (num1 == num2) iguales++
    if (num1 == num3) iguales++
    if (num2 == num3) iguales++

    // Ajustamos el contador si los tres números son iguales
    if (iguales == 2) iguales = 3

    println("Cantidad de números iguales: $iguales")
}
