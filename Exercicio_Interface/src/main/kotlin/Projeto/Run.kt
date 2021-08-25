package Projeto

fun main() {
    var contrato = Contrato("Contrato nº001/2021", "Contrato")
    var foto = Foto("Foto_Praia_001", "Foto")
    var documento = Documento("Apostila_Kotlin", "Documento")
    var impressora = Impressora()

    impressora.addImprimivel(foto)
    impressora.addImprimivel(contrato)
    impressora.addImprimivel(documento)
    impressora.imprime()

}