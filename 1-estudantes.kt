/*Crie um programa onde o usuário possa cadastrar estudantes sem limites.
Se o usuário digitar "PARE" o programa deve exibir a quantidade de estudantes cadastrados e a lista com cada um deles.
 */

fun main(){

    var estudantes=mutableListOf<String>()
    var nome=" "

    println("Informe o nome do aluno que você deseja cadastrar: ")
    nome=readln().orEmpty().uppercase()

    while(nome!="PARE"){
        estudantes.add(nome)

        println("Estudante cadastrado!")
        println("Insira o nome do próximo estudante a ser cadastrado ou escreva PARE para encerrar o programa.")
        nome=readln().orEmpty().uppercase()
    }

    println("Programa encerrado!\nNúmero de estudantes cadastrados: ${estudantes.size}")
    println("Estudantes cadastrados: ")
    for(nome in estudantes){
        println(nome)
    }
}
