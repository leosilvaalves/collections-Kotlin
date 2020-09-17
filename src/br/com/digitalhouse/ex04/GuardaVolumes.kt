package br.com.digitalhouse.ex04

class GuardaVolumes () {
    var contador:Int=0
    val dicionario :MutableMap<Int,List<Peca>> =mutableMapOf()

    fun guardarPecas(listaDePeca :List<Peca>):Int{
        contador++
        dicionario.put(contador,listaDePeca)
        return contador
    }

    fun mostrarPecas(){
        print("Peças que estão no guarda volumes:\n")
        dicionario.forEach{
            println(it)
        }

    }

    fun mostrarPecas(id :Int){
        println("As peças que correspondem ao identificador $id são: ${dicionario[id]}")
    }

    fun devolverPecas(id:Int){
        if(dicionario.contains(id)){
            println("As seguintes peças com identificador $id foram devolvidas:${dicionario[id]}")
            dicionario.getValue(id).forEach{
                println(it.retirada())
            }
            dicionario.remove(id)
        }else{
            println("Não temos nenhuma peça guardada com o id $id")
        }




    }
}