package com.alura.demo.service

import com.alura.demo.model.Curso
import com.alura.demo.model.Topico
import com.alura.demo.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class TopicoService(private var topicos: List<Topico>) {

    init{
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
        val topico2 = Topico(
            id = 2,
            titulo = "Duvida Kotlin 2",
            mensagem = "Variaveis no Kotlin 2",
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
        topicos =  Arrays.asList(topico, topico2, topico)
    }

    fun listar() :   List<Topico>{
       return topicos
    }

}