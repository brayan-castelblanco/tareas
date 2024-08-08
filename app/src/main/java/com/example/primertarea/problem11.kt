package com.example.primertarea

fun main() {
    println("Ingrese el presupuesto:")
    val presupuesto = readLine()?.toIntOrNull() ?: 0

    println("Ingrese el gasto en comida:")
    val comida = readLine()?.toIntOrNull() ?: 0

    println("Ingrese el gasto en electricidad:")
    val electricidad = readLine()?.toIntOrNull() ?: 0

    println("Ingrese el gasto en internet:")
    val internet = readLine()?.toIntOrNull() ?: 0

    println("Ingrese el gasto en arriendo:")
    val arriendo = readLine()?.toIntOrNull() ?: 0

    // Calculamos el gasto total
    val gastoTotal = comida + electricidad + internet + arriendo

    // Comparamos el presupuesto con el gasto total
    if (presupuesto < gastoTotal) {
        println("Rayos estoy quebrado(a)!")
    } else {
        println("Vamos melos!")
    }
}
