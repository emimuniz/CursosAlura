package com.alura.demo.controller

import com.alura.demo.dto.TopicoDTO
import com.alura.demo.model.Curso
import com.alura.demo.model.Topico
import com.alura.demo.model.Usuario
import com.alura.demo.service.TopicoService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/topicos")
class TopicoController(private val service: TopicoService) {

    @GetMapping
    fun listar(): List<Topico>{
        return service.listar()
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): Topico{
        return service.buscarPorId(id)
    }

    @PostMapping
    fun cadastrar(@RequestBody dto: TopicoDTO){
        service.cadastrar(dto)
    }
}