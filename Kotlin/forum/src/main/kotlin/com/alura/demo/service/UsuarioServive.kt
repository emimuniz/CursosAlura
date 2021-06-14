package com.alura.demo.service

import com.alura.demo.model.Curso
import com.alura.demo.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class UsuarioServive(var usuarios: List<Usuario>){
    init{
        val usuario = Usuario(
            id = 1,
            nome =  "Emillyn Silva",
            email = "emillyn_muniz@hotmail.com"
        )
        usuarios = Arrays.asList(usuario)
    }

    fun buscaPorId(id: Long): Usuario {
        return usuarios.stream().filter { c ->
            c.id == id
        }.findFirst().get()
    }
}
