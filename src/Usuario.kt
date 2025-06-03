package src

class Usuario(
    nome: String = "",
    email: String = "",
    telefone: String = ""
) : Pessoa(nome, email, telefone) {

    private val livrosEmprestados: MutableList<Emprestimo> = mutableListOf()

    fun adicionarEmprestimo(emprestimo: Emprestimo) {
        livrosEmprestados.add(emprestimo)
        println("Empréstimo do livro '${emprestimo.livro.titulo}' adicionado para o usuário $nome")
    }

    fun removerEmprestimo(emprestimo: Emprestimo) {
        if (livrosEmprestados.remove(emprestimo)) {
            println("Empréstimo do livro '${emprestimo.livro.titulo}' removido do usuário $nome")
        } else {
            println("Empréstimo não encontrado para o usuário $nome")
        }
    }
}