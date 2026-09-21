/* Exiba uma lista de planetas do sistema solar ("Mercúrio", "Vênus", "Terra", "Marte", "Júpiter", "Saturno", "Urano", "Netuno" e "Plutão") para o usuário.
 Em seguida, peça ao usuário para digitar o nome de um planeta.
 Verifique se o planeta que o usuário informou está na lista e informe ao usuário.
 */


fun main(){
    val planetas=mutableListOf("Mercúrio", "Vênus", "Terra", "Marte", "Júpiter", "Saturno", "Urano", "Netuno", "Plutão")

    while(true){
        println("\nPlanetas do Sistema Solar: $planetas")
        println("Digite o nome de um planeta (ou 'ENCERRAR PROGRAMA' para sair): ")
        val nomePlaneta=readln().orEmpty().trim()

        if(nomePlaneta.uppercase() == "ENCERRAR PROGRAMA"){
            break
        }

        val planetaEncontrado=planetas.find{it.lowercase() == nomePlaneta.lowercase()}
        if(planetaEncontrado == null){
            println("Planeta não encontrado. Deseja inseri-lo? (S/N)")
            val resposta=readln().orEmpty().uppercase().trim()
            if(resposta == "S"){
                val planetaFormatado=nomePlaneta.lowercase().replaceFirstChar{it.uppercase()}
                planetas.add(planetaFormatado)
                println("Planeta adicionado!")
                println("Lista atualizada: $planetas")
            }
        }
        else{
            println("Planeta encontrado! Deseja retirá-lo da lista? (S/N)")
            val resposta=readln().orEmpty().uppercase().trim()
            if(resposta == "S"){
                planetas.remove(planetaEncontrado)
                println("Planeta removido!")
                println("Lista atualizada: $planetas")
            }
        }
        println("Buscar outro planeta? (S/N)")
        val continuar=readln().orEmpty().uppercase().trim()
        if(continuar == "N"){
            println("Obrigado por usar nosso programa!")
            break
        }
    }
    println("\nPrograma encerrado! Obrigado.")
}

