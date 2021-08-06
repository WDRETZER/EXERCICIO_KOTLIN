class Conta(var numerodaConta: Int, var Saldo: Int, var Titular: Cliente) {

    fun Deposito(QuantiaDepositada: Int): Unit{
        Saldo += QuantiaDepositada
        println("Depósito Realizado! Saldo em R$ $Saldo")
    }

    fun Saque(ValorDoSaque: Int): Unit{
        if(ValorDoSaque > Saldo){
            println("Saldo Insuficiente!")
        } else {
            Saldo -= ValorDoSaque
            println("Transação realizada! Saldo em R$ $Saldo")
        }

    }

}