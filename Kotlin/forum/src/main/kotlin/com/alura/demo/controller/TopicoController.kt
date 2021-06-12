package com.alura.demo.controller

import com.alura.demo.model.Curso
import com.alura.demo.model.Topico
import com.alura.demo.model.Usuario
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/topicos")
class TopicoController {

    @GetMapping
    fun listar(): List<Topico>{
        val topico = Topico(
            id = 1,
            titulo = "Duvida Kotlin",
            mensagem = "Variaveis no Kotlin",
            curso = Curso(
                id = 1,
                nome = "Kotlin",
                categoria = "Programação"
            ),
            autor = Usuario(
                id = 1,
                nome = "Emillyn Silva",
                email = "emillyn_muniz@hotmail.com"
            )
        )
        return  Arrays.asList(topico, topico)
    }
}