package Projeto
// Em seguida crie uma classe chamada Impressora, nesta classe terá uma propriedade chamada listaimprimivel,
// essa propriedade é do tipo mutableListOf, que vai carregar uma lista do tipo Imprimivel.

class Impressora() {

    val listaImprimivel = mutableListOf<Imprimivel>()

    // Crie uma função que pega um Imprimível e adiciona na listaimprimivel, para isso a função recebe como parâmetro
    // uma propriedade do tipo Imprimivel, assim conseguirá adicionar esse imprimível na lista, através do .add().

    fun addImprimivel(imprimivel: Imprimivel) {
        listaImprimivel.add(imprimivel)
    }

    // Crie uma função que imprima tudo que está na listaimprimivel, nessa função pode-se utilizar do for
    // para percorrer a lista e imprimir todos os arquivos.

    fun imprime() {
        for(imprimivel in listaImprimivel){
            imprimivel.imprimir()
        }

    }

}


