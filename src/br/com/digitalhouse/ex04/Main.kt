package br.com.digitalhouse.ex04

fun main() {
    val bermuda1=Bermuda("TNG","larga")
    val tenis1=Tenis("Adidas","casual")

    val itens= listOf(bermuda1,tenis1)

    val guardaVolumes=GuardaVolumes()

    val resp= guardaVolumes.guardarPecas(itens)
    println("Número de identificação: $resp")

    guardaVolumes.devolverPecas(1)

}