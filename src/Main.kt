package src

fun main() {
    val autor = Autor(
        dataNascimento = "01/01/1990",
        nome = "Autor Exemplo",
        email = "autor@example.com",
        telefone = "1234-5678"
    )

    println(autor.apresentarAutor())
    println(autor.listarLivros())


    val emprestimo = Emprestimo(
        dataEmprestimo = "02/03/2025",
        dataDevolucao = null,
        status = "Em uso"
    )
    emprestimo.atualizarStatus("Disponível")

}