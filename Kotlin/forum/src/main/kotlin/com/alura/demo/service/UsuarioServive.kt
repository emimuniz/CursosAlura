package com.alura.demo.service

import com.alura.demo.model.Curso
import com.alura.demo.model.Usuario
import com.alura.demo.repository.UsuarioRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class UsuarioServive(private val repository: UsuarioRepository){

    fun buscaPorId(id: Long): Usuario {
        return repository.getById(id)
    }
}
