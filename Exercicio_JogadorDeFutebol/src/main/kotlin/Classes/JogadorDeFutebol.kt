package classes

//Definir uma nova classe JogadorDeFutebol contendo as seguintes propriedades:
// - nome - energia - alegria - gols - experiência

class JogadorDeFutebol (var nome: String, var energia: Int, var alegria: Int, var gols: Int, var experiencia: Int) {

    //2. Criar uma função chamada fazerGol() em JogadorDeFutebol, que tire 5 pontos de energia e
    // dê 10 pontos de alegria ao jogador, além de aumentar o número de gols em 1.
    // A função deve imprimir “GOOOOL!” na tela.

    fun fazerGol(): Unit {
        energia = energia - 5
        alegria = alegria + 10
        gols = gols + 1
        println("GOOOOL")
    }

    //Criar uma função chamada correr() em JogadorDeFutebol, que tire 10 pontos de energia dele.
    //O método deve imprimir na tela: “Cansei”.

    fun correr():Unit {
        energia = energia -10
        println("Cansei!")
    }

}