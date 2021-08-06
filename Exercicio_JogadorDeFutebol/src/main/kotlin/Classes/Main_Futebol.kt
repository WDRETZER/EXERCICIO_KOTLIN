//************************LISTA DE EXERCÍCIOS DE PROGRAMAÇÃO KOTLIN******************************//
//************************************WALTER DAWID RETZER****************************************//
//**************************************DATA: 06/08/2021*****************************************//

package Classes
import classes.JogadorDeFutebol
import classes.SessaoDeTreinamento

fun main(){

    var Jogador1 = JogadorDeFutebol("Zico", 100, 100, 0, 100 )
    println("(Jogador 1) Nome: " + Jogador1.nome + " - Energia: " + Jogador1.energia)
    Jogador1.fazerGol()
    println("(Jogador 1) Nome: " + Jogador1.nome + " - Energia: " + Jogador1.energia)

    println()

    var Jogador2 = JogadorDeFutebol("Cristiano Ronaldo", 100, 100, 0, 100 )
    println("(Jogador 2) Nome: " + Jogador2.nome + " - Energia: " + Jogador2.energia)
    Jogador2.correr()
    println("(Jogador 2) Nome: " + Jogador2.nome + " - Energia: " + Jogador2.energia)

    println()

    var treinamento= SessaoDeTreinamento(100)
    println("(Jogador 1) Nome: " + Jogador1.nome + " - Sessão de Treinamento:")
    treinamento.treinarA(Jogador1)

    println()

    println("(Jogador 2) Nome: " + Jogador2.nome + " - Sessão de Treinamento:")
    treinamento.treinarA(Jogador2)
}