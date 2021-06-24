package com.alura.demo.service

import com.alura.demo.model.Curso
import com.alura.demo.repository.CursoRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class CursoService(private val repository: CursoRepository){

    fun buscaPorId(id: Long): Curso {
        return repository.getById(id)
    }
}
