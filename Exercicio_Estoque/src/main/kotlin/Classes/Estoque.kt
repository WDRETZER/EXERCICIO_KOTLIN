//Escreva uma classe Estoque. Ela deverá possuir:
// os atributos nome (String), qtdAtual (Int) e qtdMinima (Int);
// as funções com as seguintes assinaturas:
// fun mudarNome(String nome): Unit
// fun mudarQtdMinima(Int qtdMinima): Unit
// fun repor(Int qtd): Unit
// fun darBaixa(Int qtd): Unit
// fun mostra(): Unit
// fun precisaRepor(): Boolean
// Os atributos qtdAtual e qtdMinima jamais poderão ser negativos.


package Classes

class Estoque(var nomeDoProduto: String="", var qtdAtual: Int=0, var qtdMinima: Int=0) {
    init {
        if(qtdAtual<0){
            qtdAtual = 0
        }
        if (qtdMinima<0){
            qtdMinima = 0
        }
    }

    fun mudarNome(novoNome: String): Unit{
        nomeDoProduto = novoNome
    }

    fun mudarQtdMinima(qtdMinimaNova: Int): Unit{
        qtdMinima = qtdMinimaNova
    }

//A função repor aumenta qtdAtual de acordo com o parâmetro qtd;
    fun repor(qtdAtualAdd: Int): Unit{
        qtdAtual += qtdAtualAdd
    }


// A função darBaixa diminui qtdAtual de acordo com o parâmetro qtd;
    fun darBaixa(qtdAtualRemove: Int): Unit{
        if (qtdAtual - qtdAtualRemove < 0){
            println("Quantidade Não Permitida!")
        } else qtdAtual -= qtdAtualRemove
    }

// A função mostra() retorna uma String contendo o nome do produto,sua quantidade mínima,sua quantidade atual;
    fun mostra(): String{
        return ("Nome do Produto: $nomeDoProduto. Quantidade Minima: $qtdMinima e Quantidade Atual: $qtdAtual")
    }

//A função precisaRepor retorna true caso a quantidade atual esteja menor ou igual à quantidade mínima e false, caso contrário.
    fun precisaRepor(): Boolean{
    return (qtdAtual <= qtdMinima)
    }

}

