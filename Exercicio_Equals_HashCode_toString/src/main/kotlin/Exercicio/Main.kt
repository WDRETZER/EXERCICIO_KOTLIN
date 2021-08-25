package Exercicio

fun main(){
    var pessoa1 = Pessoa("Fulano", 987654321)
    var pessoa2 = Pessoa("Beltrano", 123456789)
    var pessoa3 = Pessoa("Seu Zé", 99999999)

    println(pessoa1 == pessoa2)
    println(pessoa1.rg == pessoa2.rg)
    println(pessoa1.rg == pessoa3.rg)

    println(pessoa1.toString())

}