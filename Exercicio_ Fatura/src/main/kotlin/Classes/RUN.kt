package Classes

fun main(){

    //Sua classe Item deve conter um construtor que inicialize os quatro atributos. Se a
    //quantidade não for positiva, ela deve ser configurada como 0. Se o preço por item não
    //for positivo ele deve ser configurado como 0.0.

    //var fatura = Fatura(2, "Parafuso",10,2.50)
    var fatura = Fatura(15,"Parafuso", 10, 2.50)
    //println(fatura.preço)
    //println(fatura.quantidade)
    println("Total da Fatura: R$ " + fatura.totalDaFatura() )
   }