open class Conta(var cliente: Cliente, var saldo: Double) {

    fun Deposito(QuantiaDepositada: Int): Unit{
        saldo += QuantiaDepositada
        println("Depósito Realizado! Saldo em R$ $saldo")
    }

    fun Saque(ValorDoSaque: Int): Unit{
        if(ValorDoSaque > saldo){
            println("Saldo Insuficiente!")
        } else {
            saldo -= ValorDoSaque
            println("Transação realizada! Saldo em R$ $saldo")
        }

    }

    fun ConsultaSaldo(){
        println("Saldo em R$ $saldo")
    }


}