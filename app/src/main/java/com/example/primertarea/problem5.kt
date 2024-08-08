package com.example.primertarea

fun main() {
    println("Ingrese el número de estudiantes:")
    val estudiantes = readLine()?.toIntOrNull() ?: 0

    println("Ingrese el número total de manzanas:")
    val manzanas = readLine()?.toIntOrNull() ?: 0

    // Calculamos las manzanas por estudiante (división entera)
    val manzanasPorEstudiante = manzanas / estudiantes

    // Calculamos las manzanas restantes en la canasta (módulo)
    val manzanasRestantes = manzanas % estudiantes

    println("Cada estudiante recibirá $manzanasPorEstudiante manzanas.")
    println("$manzanasRestantes manzanas quedarán en la canasta.")
}
