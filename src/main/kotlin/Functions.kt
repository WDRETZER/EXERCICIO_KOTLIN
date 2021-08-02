//************************LISTA DE EXERCÍCIOS DE PROGRAMAÇÃO KOTLIN******************************//
//************************************WALTER DAWID RETZER****************************************//
//**************************************DATA: 02/08/2021*****************************************//

fun main (){
    print("Teste Exercicio 01. Resposta: ")
    println(maxOf(15,30, 50))
    println(" ")

    print("Teste Exercicio 02. Resposta: ")
    println (string_compare("ol", "ola"))
    println(" ")

    print("Teste Exercicio 03. Resposta: ")
    println(num_par(10))
    println(" ")

    print("Teste Exercicio 04. Resposta: ")
    println(imprime_impar(100))
    println(" ")

    print("Teste Exercicio 05. Resposta: ")
    println(testa_num(5, 5, 55, 15))
    println(" ")

    print("Teste Exercicio 06. Resposta: ")
    print(num_positivos(100))
    println(" ")

}

//EXERCICIO 01: RETORNAR O VALOR MAXIMO DE 3 NÚMEROS
fun maxOf(a: Int, b: Int, c: Int): Int {
    if (a > b && a > c) {
        return a
    }
    if (b > a && b > c){
        return b
    }
    else {
        return c
    }
}

// EXERCICIO 02: COMPARAÇÃO DE DUAS STRINGS
fun string_compare(letter: String, letter1: String): Boolean{
    if (letter == letter1){
        return false
    } else{
        return true;
    }
}

// EXERCÍCIO 03: TESTA SE UM NÚMERO É PAR
fun num_par (num: Int): Boolean{
    if(num % 2 == 0){
        return true;
    }else{
        return false;
    }
}

// IMPRIME OS 100 PRIMEIROS NUMEROS IMPARES:
fun imprime_impar(numMax: Int){
    println()
    for (i in 0..(numMax*2)){
        if(i % 2 != 0){
            print(i)
            print(" ")
            if(i==49 || i==99 || i==149){
                println(" ")
            }
        }
    }
}

// EXERCICIO 05: TESTA 4 NÚMEROS INT
fun testa_num(numA: Int, numB: Int, numC: Int, numD: Int): Boolean{
    if ((numA > numC && numA > numC) || (numB > numC && numB > numD)){
        return true;
    } else {
        return false;
    }
}

// EXERCICIO 06: IMPRIME OS 100 PRIMEIROS NÚMEROS NEGATIVOS:
fun num_positivos(numPositivo: Int){
    println()
    for(i in 1..(numPositivo)){
        print(i)
        print(" ")
        if(i==25 || i==50 || i==75){
            println()
        }
    }
}

















