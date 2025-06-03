package src

class Livro(
    val id: String,
    val titulo: String,
    val isbn: String,
    val autor: Autor,
    val disponivel: Boolean
) {

    fun verificaDisponibilidades(): Boolean{
        if(this.disponivel){
            println("O livro $titulo está disponível.")
            return true
        }
        else{
            println("O livro $titulo não está disponível.")
            return false
        }
    }

    fun exibirDetalhes() {
        println("Título: $titulo")
        println("ISBN: $isbn")
        println("Autor: ${autor.nome}")
        println("Disponível: ${if (disponivel) "Sim" else "Não"}")
    }
}