package src

import java.util.UUID

class Emprestimo (
    val livro: Livro = Livro(),
    val usuario: Usuario = Usuario(),
    val dataEmprestimo: String,
    var dataDevolucao: String?,
    var status: String

){
    companion object {
        const val STATUS_EM_USO = "Em uso"
        const val STATUS_DISPONIVEL = "Disponível"
    }
    val id: String = UUID.randomUUID().toString()

    public fun atualizarStatus(status: String){
        if(status == STATUS_EM_USO || status == STATUS_DISPONIVEL){
            if(status == "Em uso"){
                this.status = STATUS_EM_USO
                println("Status atualizado com sucesso! ${this.status}")
            }else{
                this.status = STATUS_DISPONIVEL
                println("Status atualizado com sucesso! ${this.status}")            }
        }else{
            println("Valor ${status} é inválido por favor digite Em uso ou disponível ")
        }

    }
}