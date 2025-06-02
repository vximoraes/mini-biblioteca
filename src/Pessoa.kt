package src

import java.util.UUID

abstract class Pessoa(
    val nome: String,
    val email: String,
    val telefone: String
) {
    val id: String = UUID.randomUUID().toString()
}