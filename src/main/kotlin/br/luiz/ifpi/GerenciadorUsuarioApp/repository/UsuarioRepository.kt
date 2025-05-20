package br.luiz.ifpi.GerenciadorUsuarioApp.repository

import br.luiz.ifpi.GerenciadorUsuarioApp.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface UsuarioRepository: JpaRepository<Usuario, Long> {



}