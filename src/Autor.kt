package src

class Autor(
    val dataNascimento: String,
    nome: String,
    email: String,
    telefone: String
) : Pessoa(nome, email, telefone) {
    fun apresentarAutor(): String {
        return "Nome: '$nome' \n" +
                "Email: '$email' \n" +
                "Telefone: '$telefone' \n" +
                "Data de Nascimento: '$dataNascimento'"
    }

    fun listarLivros(livroManager: Livro) {
        val livros = livroManager.listarLivrosPorAutor(this)
        if (livros.isEmpty()) {
            println("Nenhum livro encontrado para o autor ${this.nome}.")
        } else {
            println("Livros do autor ${this.nome}: ${livros.joinToString { it.titulo }}")
        }
    }
}