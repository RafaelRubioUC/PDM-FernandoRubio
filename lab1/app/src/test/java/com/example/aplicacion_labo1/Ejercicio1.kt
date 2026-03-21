package com.example.aplicacion_labo1

class computadora(

    var ram: Int,
    var almacenamiento: Int,
    var sistemaOperativo: String,
    var programasInstalados: List<String>,
){
    fun encenderComputadora(){
        println("La computadora se esta encendiendo")
    }
    fun apagarComputadora(){
        println("La computadora se esta apagando")
    }
    fun encontrarProgramas(): List<String>{
        return programasInstalados.filter {it.contains("2026")}
    }
}


