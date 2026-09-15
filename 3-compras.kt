// criar uma lista de compras usando array.

fun main(){

    var frutas=arrayOf("Morango", "Banana", "Uva", "Manga", "Mamão", "Laranja","Goiaba") //array de string

    while(frutas.isNotEmpty()){//enquanto o array nao estiver vazio, faça
        println("Frutas disponíveis no nosso mercado: ${frutas.joinToString()}")
        println("Qual fruta você quer adicionar no carrinho?(Caso dejese encerrar, escreva 'SAIR'): ")
        var nomeFruta=readlnOrNull().orEmpty()
        if(nomeFruta.uppercase()=="SAIR"){
            println("Programa encerrado! Obrigado por acessar nosso mercado virtual.")
            println("Frutas restantes: ${frutas.joinToString()}")
            break
        }
        else{
            val frutaExiste=frutas.any{it.equals(nomeFruta, ignoreCase=true)}//buscamos a fruta digitada pelo usuario
            if(frutaExiste){
                frutas=frutas.filterNot{it.equals(nomeFruta, ignoreCase=true)}.toTypedArray()//retiramos da lista e transformamos a list em array. Lembrando que o filter transf o array em list dps de filtrar
                println("Fruta adicionada ao carrinho!")
            }
            else{
                println("Fruta indisponível no momento.")
            }
        }
    }
    if(frutas.isEmpty()){
        println("Acabaram as frutas do mercado...Obrigado pela compra.")
    }
}
