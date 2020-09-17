package br.com.digitalhouse.ex04

class Bermuda(marca:String,modelo:String) :Peca(marca,modelo) {
    override fun retirada() {
        println("Bermuda da $marca e modelo $modelo retirada.")
    }
}