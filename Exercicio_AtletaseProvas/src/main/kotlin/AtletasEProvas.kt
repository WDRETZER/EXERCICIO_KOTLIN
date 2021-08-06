//************************LISTA DE EXERCÍCIOS DE PROGRAMAÇÃO KOTLIN******************************//
//************************************WALTER DAWID RETZER****************************************//
//**************************************DATA: 06/08/2021*****************************************//


package Classes

fun main(){

    var competidor1 = Atleta("Albert Einstein",95, 80)
    var competidor2 = Atleta("Nicolas Tesla",92, 82)

    println("Prova 1")
    val prova1 = Prova(90,79)
    println(competidor1.nome + " Pode Realizar a Prova 1? " + prova1.podeRealizar(competidor1))
    println(competidor2.nome + " Pode Realizar a Prova 1? " + prova1.podeRealizar(competidor2))
    println("")

    println("Prova 2")
    val prova2 = Prova(94,79)
    println(competidor1.nome + " Pode Realizar a Prova 2? " + prova2.podeRealizar(competidor1))
    println(competidor2.nome + " Pode Realizar a Prova 2? " + prova2.podeRealizar(competidor2))
    println("")

    println("Prova 3")
    val prova3 = Prova(95,83)
    println(competidor1.nome + " Pode Realizar a Prova 1? " + prova3.podeRealizar(competidor1))
    println(competidor2.nome + " Pode Realizar a Prova 1? " + prova3.podeRealizar(competidor2))
    println("")
}