package br.com.digitalhouse.ex02

fun main() {
    val lista1 :MutableList<Int> =mutableListOf()
    lista1.add(1)
    lista1.add(5)
    lista1.add(5)
    lista1.add(6)
    lista1.add(7)
    lista1.add(8)
    lista1.add(8)
    lista1.add(8)
    println(lista1)

    val conjunto1 :MutableSet<Int> = mutableSetOf()
    conjunto1.add(1)
    conjunto1.add(5)
    conjunto1.add(5)
    conjunto1.add(6)
    conjunto1.add(7)
    conjunto1.add(8)
    conjunto1.add(8)
    conjunto1.add(8)
    println(conjunto1)

}