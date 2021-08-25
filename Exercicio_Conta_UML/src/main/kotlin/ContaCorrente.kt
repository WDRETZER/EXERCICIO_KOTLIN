open class ContaCorrente(var contacorrente: Conta, var chequeEspecial: Double, var cheque: Cheque) {

    fun DepositaCheque(){
        cheque.valor += contacorrente.saldo
        println("Depósito Realizado! Saldo em R$ ${contacorrente.saldo}")

    }


}