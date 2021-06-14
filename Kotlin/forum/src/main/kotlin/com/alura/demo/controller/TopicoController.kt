package com.alura.demo.controller

import com.alura.demo.model.Curso
import com.alura.demo.model.Topico
import com.alura.demo.model.Usuario
import com.alura.demo.service.TopicoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/topicos")
class TopicoController(private val service: TopicoService) {

    @GetMapping
    fun listar(): List<Topico>{
        return service.listar()
    }
}