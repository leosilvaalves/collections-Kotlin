package br.com.digitalhouse.ex04

class Tenis(marca:String,modelo:String) :Peca(marca,modelo) {

    override fun retirada(){
        println("Tênis da $marca e modelo $modelo retirado")
    }
}