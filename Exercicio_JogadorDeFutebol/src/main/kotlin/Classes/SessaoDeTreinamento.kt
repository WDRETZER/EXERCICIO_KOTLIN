package classes

//4. Definir uma nova classe SessaoDeTreinamento contendo as seguintes propriedades:
//- experiência (ganha quando um treinamento é realizado)

class SessaoDeTreinamento(var experiencia: Int) {
    // Criar uma função chamado treinarA que tenha como parâmetro de entrada um jogador de futebol.
    // Como é um treinamento, o jogador precisa: 1- Correr 2- Fazer um Gol 3- Correr

    fun treinarA(jogador: JogadorDeFutebol): Unit {
        println("Experiencia Inicial: $experiencia")
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        experiencia +=1
        println("Experiencia Final: $experiencia")
    }

}