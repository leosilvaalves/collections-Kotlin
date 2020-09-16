package br.com.digitalhouse.ex03

class Prova {

    fun somaTotal(conjuntoDeInteiros :Set<Int>){
        var total=0.0
        for(i in conjuntoDeInteiros) total+=i

        println("Total: $total")
    }
}