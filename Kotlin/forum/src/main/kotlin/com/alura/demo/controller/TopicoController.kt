package com.alura.demo.controller

import com.alura.demo.dto.TopicoForm
import com.alura.demo.dto.TopicoView
import com.alura.demo.service.TopicoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/topicos")
class TopicoController(private val service: TopicoService) {

    @GetMapping
    fun listar(): List<TopicoView>{
        return service.listar()
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): TopicoView{
        return service.buscarPorId(id)
    }

    @PostMapping
    fun cadastrar(@RequestBody dto: TopicoForm){
        service.cadastrar(dto)
    }
}