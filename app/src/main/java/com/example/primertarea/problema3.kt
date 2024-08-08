package com.example.primertarea

fun main() {
    println("Ingrese la calificación del primer corte (0-5.0):")
    val calificacion1 = readLine()?.toDoubleOrNull() ?: 0.0

    println("Ingrese la calificación del segundo corte (0-5.0):")
    val calificacion2 = readLine()?.toDoubleOrNull() ?: 0.0

    println("Ingrese la calificación del tercer corte (0-5.0):")
    val calificacion3 = readLine()?.toDoubleOrNull() ?: 0.0

    // Pesos de cada corte
    val peso1 = 0.33
    val peso2 = 0.33
    val peso3 = 0.34

    // Cálculo de la calificación final
    val calificacionFinal = calificacion1 * peso1 + calificacion2 * peso2 + calificacion3 * peso3

    println("La calificación final es: $calificacionFinal")
}
