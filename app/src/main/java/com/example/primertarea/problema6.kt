package com.example.primertarea

fun main() {
    println("Ingrese un número de tres dígitos:")
    val numero = readLine()?.toIntOrNull() ?: 0

    // Validación para asegurarnos que sea un número de tres dígitos
    if (numero < 100 || numero > 999) {
        println("El número ingresado no es de tres dígitos.")
        return
    }

    // Separamos los dígitos
    val centenas = numero / 100
    val decenas = (numero % 100) / 10
    val unidades = numero % 10

    // Calculamos la suma
    val suma = centenas + decenas + unidades

    println("La suma de los dígitos de $numero es: $suma")
}
