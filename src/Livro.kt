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
            println("O livro ${this.titulo} está disponível.")
            return true
        }
        else{
            println("O livro ${this.titulo} não está disponível.")
            return false
        }
    }
}