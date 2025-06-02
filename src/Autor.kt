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

    fun listarLivros() {
        val livros = Livro.livros.filter { it.autor == this }
        if (livros.Empty()) {
            println("Nenhum livro encontrado para o autor ${this.nome}.")
        }

        println("Livros do autor ${this.nome}: ${livros.joinToString { it.titulo }}")
    }
}