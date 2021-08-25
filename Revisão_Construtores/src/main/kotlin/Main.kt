
open class Person(var nome: String = "Teste") {

    //Primeiro deve-se declarar as variáveis para o construtor, elas devem ser inicializadas!
    var sobrenome: String

    //Para o construtor secundário, deve passar os parâmetros(nome e sobrenome)
    //deve utilizar a palavra this para referenciar o construtor primário!
    constructor(nome: String, sobrenome: String) : this(nome) {
        this.sobrenome = sobrenome // a palavra this é utilizada para referenciar a variável sobrenome ao construtor
    }

    var rg: String

    constructor(nome: String, sobrenome: String, rg: String) : this(nome, sobrenome) {
        this.rg = rg
        //this.sobrenome = sobrenome
    }

    var cpf: String

    constructor(nome: String, sobrenome: String, rg: String, cpf: String) : this(nome, sobrenome, rg) {
        this.cpf = cpf
    }

    init {
        rg =  "----------"
        cpf = "**********"
        sobrenome = ".........."

    }
    init {
        println("Por favor verifique os dados de cadastro do Sr(a): "+nome)
    }

}

class Student() : Person(){
    var id:String
    init {
        nome = " - "
        id = "000000"
        rg =  "----------"
    }
    init {
        println("Por favor Cadastre o ID do Estudante: $nome")
        println()
    }

    constructor(nome: String, rg: String, id:String) : this(){
        this.id = id
        this.rg = rg

    }
}


fun main() {
    println()

    var estudante1 = Student("Fabiana", "", "")
    var estudante2 = Student()

/*
    var person = Person("Walter")
    println(person.nome + " " + person.sobrenome + " RG:" + person.rg + " CPF:" + person.cpf)
    println()

    var person1 = Person("Zezinho", "da Silva")
    println(person1.nome + " " + person1.sobrenome + " RG:" + person1.rg + " CPF:" + person1.cpf)
    println()

    var person2 = Person("Huguinho", "da Luz", "0123456789", "999999")
    println(person2.nome + " " + person2.sobrenome + " RG:" + person2.rg + " CPF:" + person2.cpf)
    println()

    var person3 = Person("Luizinho", "Soares", "9876543210")
    println(person3.nome + " " + person3.sobrenome + " RG:" + person3.rg + " CPF" + person3.cpf)
    println()
*/
}