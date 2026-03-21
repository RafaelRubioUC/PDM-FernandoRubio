package com.example.aplicacion_labo1

import org.junit.Test

class pruebasEjercicios{

    @Test
    fun ejercicio1Prueba(){

        val programas = listOf(
            "Notion 2026",
            "Youtube 2010",
            "Instagra 2013",
            "X 2026",
            "Telegram 2026"
        )

        val pc = computadora(16, 512, "Windows 10", programas)

        println("Estado: Inicial \n")
        pc.encenderComputadora()
        println("Ram: ${pc.ram} | Almacenamiento: ${pc.almacenamiento} | Sistema operativo: ${pc.sistemaOperativo} | Programas instalados: ${pc.programasInstalados} \n")

        println("Estado: Actualizado")
        pc.ram = 32
        pc.almacenamiento = 1000
        pc.sistemaOperativo = "linux"
        println("Ram: ${pc.ram} | Almacenamiento: ${pc.almacenamiento} | Sistema operativo: ${pc.sistemaOperativo} | Programas instalados: ${pc.programasInstalados}\n")

        val programas2026 = pc.encontrarProgramas()

        println("Programas 2026")
        if (programas2026.isEmpty())
            println("No hay programas del año 2026")
        else(
            programas2026.forEach { println("- $it") }
        )
        println()

        pc.apagarComputadora()

        println()


    }


    @Test
    fun ejercicio2Prueba() {

        val miCalc = Calculadora("CASIO", 15, 45.50)

        println("CALCULADORA ${miCalc.marca}")
        println("Precio inicial: $${miCalc.precio} | Vida estimada: ${miCalc.añosDeVida} años\n")

        println("Suma (10 + 5): ${miCalc.sumar(10.0, 5.0)}")
        println("Resta (20 - 8): ${miCalc.restar(20.0, 8.0)}")
        println("Multiplicacion (4 * 3): ${miCalc.multiplicar(4.0, 3.0)}")

        println("Division (10 / 2): ${miCalc.dividir(10.0, 2.0)}")
        println("División (10 / 0): ${miCalc.dividir(10.0, 0.0)}")

        miCalc.precio = 39.99
        println("\nPrecio de oferta: $${miCalc.precio}")

    }

    @Test
    fun ejercicio3Prueba() {

        val ciclo01 = listOf(

            Estudiante("Fernando Rubio", "0022026", "Programacion de Dispositivos Moviles"),
            Estudiante("Ana Garcia", "00047225", "Programacion de Dispositivos Moviles"),
            Estudiante("Luis Perez", "000324", "Programacion de Dispositivos Moviles"),


            Estudiante("Carla Mendez", "000320", "Analisis Numerico"),
            Estudiante("Jose Rivas", "000622", "Analisis Numerico"),
            Estudiante("Marta Díaz", "000424", "Analisis Numerico"),
            Estudiante("Roberto Sol", "000323", "Analisis Numerico")
        )

        println("REGISTRO ACADEMICO CICLO 01")

        val estudiantesPDM = ciclo01.filter { it.asignatura == "Programacion de Dispositivos Moviles" }

        println("Estudiantes en la materia de Programacion de Dispositivos Moviles:")
        if (estudiantesPDM.isEmpty()) {
            println("No hay estudiantes registrados en esta materia.")
        } else {
            estudiantesPDM.forEach {
                println("- ${it.nombre} (Carnet: ${it.carnet})")
            }
        }

        println("\nTotal: ${estudiantesPDM.size} estudiantes")

    }



}