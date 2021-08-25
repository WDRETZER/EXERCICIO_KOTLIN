package Classes

//Uma lista de itens cada Item possui:
// o número do item faturado;
// a descrição do item;
// a quantidade comprada do item
// o preço unitário do item.

class Fatura(var numerodoitem: Int, var descrição: String, var quantidade: Int=0, var preço: Double=0.0) {

    //Além disso, na classe Fatura uma função chamada totalDaFatura que calcula o valor da
    //fatura (isso é, multiplicar a quantidade pelo preço de cada item) e depois retorna o valor
    //como um Double.

    fun totalDaFatura():Double{
        return quantidade*preço
    }

}