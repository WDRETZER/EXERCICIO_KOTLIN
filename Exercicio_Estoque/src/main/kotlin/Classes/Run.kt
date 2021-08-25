package Classes

fun main(){
    var estoque = Estoque("Placa Arduino Uno",-5, -10)
    println(estoque.mostra())
    println()

    println(estoque.mudarNome("Placa Arduino Mega 2560"))
    println(estoque.mostra())
    println()

    println(estoque.mudarQtdMinima(10))
    println(estoque.mostra())
    println()

    println(estoque.repor(10))
    println(estoque.mostra())
    println()

    println(estoque.darBaixa(10))
    println(estoque.mostra())
    println()

    println(estoque.precisaRepor())


}