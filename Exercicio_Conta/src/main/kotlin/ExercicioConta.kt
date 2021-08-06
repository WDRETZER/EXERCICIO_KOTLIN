//************************LISTA DE EXERCÍCIOS DE PROGRAMAÇÃO KOTLIN******************************//
//************************************WALTER DAWID RETZER****************************************//
//**************************************DATA: 06/08/2021*****************************************//

package Classes
import Cliente
import Conta

fun main(){
    var cliente = Cliente("Walter", "Retzer")
    var cliente2 = Cliente("João", "das Neves")

    var conta1 = Conta(123456, 1000, cliente);
    var conta2 = Conta(654321, -500, cliente2);

    conta1.Deposito(500)
    conta1.Saque(1500)

    conta2.Deposito(1000)
    conta1.Saque(1500)

}