package com.alura.demo.service

import com.alura.demo.model.Curso
import org.springframework.stereotype.Service
import java.util.*

@Service
class CursoService(var cursos: List<Curso>){

    init{
        val curso = Curso(
            id = 1,
            nome = "Kotlin",
            categoria = "Programação"
        )
        cursos = Arrays.asList(curso)
    }

    fun buscaPorId(id: Long): Curso {
        return cursos.stream().filter { c ->
            c.id == id
        }.findFirst().get()
    }
}
