package Projeto

// FOTO -> Na função deve printar: Eu sou uma foto, selfie

class Foto(override var nome: String, override var tipoDoc: String): Imprimivel {
    override fun imprimir() {
        println("Eu sou uma $nome - tipo: $tipoDoc")
    }
}