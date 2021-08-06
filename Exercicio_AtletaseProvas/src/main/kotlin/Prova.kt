//2. Definir uma nova classe Prova contendo as seguintes propriedades:
// dificuldade  - energiaNecessaria

package Classes

class Prova(var dificuldade: Int, var energiaNecessaria: Int) {

    fun podeRealizar(competidor: Atleta): Boolean{
        return (competidor.nivel >= dificuldade && competidor.energia > energiaNecessaria)
    }
}