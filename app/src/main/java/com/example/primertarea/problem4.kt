package com.example.primertarea

fun main() {
    println("Ingrese el precio del primer artículo:")
    val precio1 = readLine()?.toDoubleOrNull() ?: 0.0

    println("Ingrese el precio del segundo artículo:")
    val precio2 = readLine()?.toDoubleOrNull() ?: 0.0

    println("Ingrese el precio del tercer artículo:")
    val precio3 = readLine()?.toDoubleOrNull() ?: 0.0

    // Calculamos el valor total neto
    val valorNeto = precio1 + precio2 + precio3

    // Calculamos el impuesto
    val impuesto = valorNeto * 0.18

    // Calculamos el valor total con impuesto
    val valorTotal = valorNeto + impuesto

    println("El valor total neto de la compra es: $valorNeto")
    println("El valor del impuesto es: $impuesto")
    println("El valor total de la compra incluyendo impuestos es: $valorTotal")
}
