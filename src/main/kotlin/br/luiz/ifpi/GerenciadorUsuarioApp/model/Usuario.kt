package br.luiz.ifpi.GerenciadorUsuarioApp.model

import jakarta.persistence.*
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import org.hibernate.validator.constraints.br.CPF

@Entity
data class Usuario(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @field:NotBlank(message = "Nome é obrigatório")
    var nome: String = "",

    @field:NotBlank(message = "Email é obrigatório")
    @field:Email(message = "Email inválido")
    var email: String = "",

    @field:NotBlank(message = "CPF é obrigatório")
    @field:CPF(message = "CPF inválido")
    var cpf: String = "",

    @field:NotBlank(message = "Senha é obrigatória")
    @field:Size(min = 6, max = 12, message = "A senha deve ter entre 6 e 12 caracteres")
    var senha: String = "",

    var papel: String = "",

    // Novos campos de localização
    var latitude: Double? = null,

    var longitude: Double? = null
)
