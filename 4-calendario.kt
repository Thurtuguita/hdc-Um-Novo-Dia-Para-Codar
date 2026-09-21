//Crie um programa que funcione como uma agenda de contatos.


data class Contatos(
    var nome:String=" ",
    var telefone:String=" ")

fun main() {
    var listaCtt = mutableListOf(
        Contatos("LIAN", "(11)94002-8922"),
        Contatos("MAX", "(11)96767-6767"),
        Contatos("ANNE", "(11)99999-9999"),
        Contatos("VITO", "(11)90000-0000")
    )
    println("Agenda de Contatos")

    while (true) {
        println("1) Encontrar Contatos.")
        println("2) Cadastrar Contato.")
        println("3) Remover Contato.")
        println("Digite 'LISTAR' para ver a Lista completa de contatos.")
        println("Digite 'SAIR' para encerrar.\n")
        println("Informe a opção escolhida: ")
        val opcao = readlnOrNull().orEmpty().trim().uppercase()

        when (opcao) {
            "1" -> {
                println("Digite o nome do contato para busca: ")
                val buscar = readlnOrNull().orEmpty().trim().uppercase()
                var encontrado = false

                for (contatos in listaCtt) {
                    if (buscar == contatos.nome) {
                        println("Contato encontrado! Tel: ${contatos.telefone}")
                        encontrado = true
                        break
                    }
                }
                if (!encontrado) {
                    println("Contato não encontrado!")
                }
            }

            "2" -> {
                println("Digite o nome do contato que deseja adicionar: ")
                val nome = readlnOrNull().orEmpty().trim().uppercase()
                println("Digite o número de telefone: ")
                val telefone = readlnOrNull().orEmpty().trim()

                if (nome.isEmpty() || telefone.isEmpty()) {
                    println("Erro: Nome e telefone não podem ser vazios!")
                } else {
                    listaCtt.add(Contatos(nome, telefone))
                    println("Contato $nome cadastrado com sucesso!")
                }
            }

            "3" -> {
                println("Digite o nome do contato que deseja remover: ")
                val remover = readlnOrNull().orEmpty().trim().uppercase()
                var contatoParaRemover: Contatos? = null
                for (contatos in listaCtt) {
                    if (remover == contatos.nome) {
                        contatoParaRemover = contatos
                        break
                    }
                }
                if (contatoParaRemover != null) {
                    listaCtt.remove(contatoParaRemover)
                    println("Contato $remover removido com sucesso!")
                } else {
                    println("Contato não encontrado.")
                }
            }

            "LISTAR" -> {
                if (listaCtt.isEmpty()) {
                    println("A agenda está vazia.")
                } else {
                    println("Seus Contatos:")
                    for (contatos in listaCtt) {
                        println("Nome: ${contatos.nome} | Tel: ${contatos.telefone}")
                    }
                }
            }

            "SAIR" -> {
                println("Programa encerrado. Total de contatos: ${listaCtt.size}")
                break
            }

            else -> {
                println("Opção inválida! Tente novamente.")
            }
        }
    }
}