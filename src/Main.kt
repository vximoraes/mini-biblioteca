package src

fun main() {
    println("=== Bem-vindo à Mini Biblioteca ===")
    println("\n==============================\n")
    // Criando autor
    val autor = Autor(
        dataNascimento = "01/01/1990",
        nome = "Quentin Tarantino",
        email = "autor@example.com",
        telefone = "1234-5678"
    )
    println("Autor criado:")
    println("------------------------------")
    println(autor.apresentarAutor())
    println("\n==============================\n")

    // Criando gerenciador de livros
    val livroManager = Livro(
        id = "0",
        titulo = "",
        isbn = "",
        autor = autor,
        disponivel = true
    )

    // Criando e adicionando livros
    val livro1 = Livro(
        id = "1",
        titulo = "Era Uma Vez em Hollywood",
        isbn = "123-456-789",
        autor = autor,
        disponivel = true
    )
    livroManager.adicionarLivro(livro1)

    val livro2 = Livro(
        id = "2",
        titulo = "Cães de Aluguel",
        isbn = "987-654-321",
        autor = autor,
        disponivel = false
    )
    livroManager.adicionarLivro(livro2)

    println("Detalhes dos livros adicionados:")
    println("------------------------------")
    livro1.exibirDetalhes()
    println("------------------------------")
    livro2.exibirDetalhes()
    println("\n==============================\n")

    // Listando livros do autor
    println("Listando livros do autor '${autor.nome}':")
    println("------------------------------")
    autor.listarLivros(livroManager)
    println("\n==============================\n")

    // Criando usuário
    val usuario = Usuario(
        nome = "Jorge Lucas",
        email = "jorge.lucas@email.com",
        telefone = "5678-1234"
    )
    println("Usuário criado:")
    println("------------------------------")
    println("Nome: ${usuario.nome}")
    println("Email: ${usuario.email}")
    println("Telefone: ${usuario.telefone}")
    println("\n==============================\n")

    // Criando empréstimo
    val emprestimo = Emprestimo(
        livro = livro1,
        usuario = usuario,
        dataEmprestimo = "02/03/2025",
        dataDevolucao = null,
        status = "Em uso"
    )
    usuario.adicionarEmprestimo(emprestimo) // Adicionando o empréstimo ao usuário
    println("Empréstimo criado:")
    println("------------------------------")
    println("Livro: ${emprestimo.livro.titulo}")
    println("Usuário: ${emprestimo.usuario.nome}")
    println("Data de Empréstimo: ${emprestimo.dataEmprestimo}")
    println("Status: ${emprestimo.status}")
    println("\n==============================\n")

    // Atualizando status do empréstimo
    emprestimo.atualizarStatus("Em uso")
    println("Status do empréstimo atualizado:")
    println("------------------------------")
    println("Livro: ${emprestimo.livro.titulo}")
    println("Status Atual: ${emprestimo.status}")
    println("\n==============================\n")

    // Removendo empréstimo do usuário
    usuario.removerEmprestimo(emprestimo)
}
