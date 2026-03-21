package com.example.aplicacion_labo1

class Calculadora(
    val marca: String,
    val añosDeVida: Int,
    var precio: Double      // Mutable
) {

    fun sumar(a: Double, b: Double): Double {
        return a + b
    }

    fun restar(a: Double, b: Double): Double {
        return a - b
    }

    fun multiplicar(a: Double, b: Double): Double {
        return a * b
    }

    fun dividir(a: Double, b: Double): Double? {

        if (b == 0.0) {
            println("No se puede dividir entre 0")
            return null
        }
        return a / b
    }
}