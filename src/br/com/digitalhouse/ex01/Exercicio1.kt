package br.com.digitalhouse.ex01

fun main() {
    val  loteriaDosSonhos=mapOf(
            0 to "Ovos",
            1 to "Água",
            2 to "Escopeta",
            3 to "Cavalo",
            4 to "Dentista",
            5 to "Fogo")

    val  apelidosAmigos=mapOf(
            "João" to listOf("Juan","Fissura","Maromba"),
            "Miguel" to listOf("Night Watch","Bruce Wayne","Tampinha"),
            "Maria" to listOf("Wonder Woman","Mary","Marilene"),
            "Lucas" to listOf("Lukinha","Jorge","George")
    )

    println("-------------------")
    loteriaDosSonhos.forEach{
        println(it)
    }


    println("-------------------")
    apelidosAmigos.forEach{
        println(it)
    }

}