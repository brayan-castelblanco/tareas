package com.example.primertarea
import kotlin.math.*

fun main() {
    println("Ingrese la base:")
    val base = readLine()?.toIntOrNull() ?: 0

    println("Ingrese el exponente:")
    val exponente = readLine()?.toIntOrNull() ?: 0

    // Calculamos la potencia
    val potencia = kotlin.math.pow(base.toDouble(), exponente.toDouble()).toInt()

    // Comparamos con 5000 e imprimimos el resultado
    if (potencia > 5000) {
        println("Muy grande.")
    } else {
        println("Números óptimos.")
    }
}
