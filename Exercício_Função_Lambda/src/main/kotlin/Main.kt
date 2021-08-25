fun main() {

    //1- Crie 4 funções lambdas para as operações de matemática básica: soma,
    //subtração, multiplicação e divisão. Cada lambda receberá 2 parâmetros para realizar as operações.
    //Crie uma função Main e execute-as, printando os resultados.

    val soma: (Double, Double) -> Unit = { a: Double, b: Double -> println(a + b) }
    val subtração: (Double, Double) -> Unit = { x: Double, y: Double -> println(x - y) }
    val multiplicação: (Double, Double) -> Unit = { a: Double, b: Double -> println(a * b) }
    val divisão: (Double, Double) -> Unit = { x: Double, y: Double -> println(x / y) }

    soma(50.0, 100.0)
    subtração(-10.0, 10.0)
    multiplicação(10.0, 0.5)
    divisão(10.0, 3.0)

    // 2 - Crie uma função lambda que receba um e-mail e valide-o para saber se está conforme as regras básicas.
    // Para cumprir a regra básica principal, o mesmo deve conter um @.
    // OBS. essa função deve retornar true ou false, ok? =)
    // Execute-o na função Main, printando o resultado.

    val validaEmail: (String) -> Boolean = { email ->
        email.contains( char = '@')
    }

    var email: String = "teste_email@yahoo.com.br"
    println()
    println("Checar o seguinte email: ${email}")
    println("Email válido:  ${validaEmail(email)}")
    println()

    //3 - Crie uma função lambda que receba uma List<Int> e calcule e retorne o produto dos itens contidos na mesma.
    //Execute-o na função Main, printando o resultado.

    val Produto = { lista: List<Int> ->
        var resultado: Int = 1
        if(lista.isEmpty()){
            resultado = 0
        } else{
            for(item in lista){
                resultado *= item
            }
        }
        println(resultado)
    }

    Produto(listOf(2,10))

}