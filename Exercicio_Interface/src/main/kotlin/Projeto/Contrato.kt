package Projeto

class Contrato(override var nome: String, override var tipoDoc: String): Imprimivel {
    override fun imprimir() {
        println("Eu sou um $nome - $tipoDoc")
    }
}