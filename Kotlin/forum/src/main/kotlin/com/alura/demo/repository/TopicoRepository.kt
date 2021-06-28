package com.alura.demo.repository

import com.alura.demo.dto.TopicoPorCategoriaDto
import com.alura.demo.model.Topico
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface TopicoRepository: JpaRepository<Topico, Long> {

    fun findByCursoNome(nomeCurso: String, paginacao: Pageable): Page<Topico>

    @Query("SELECT new com.alura.demo.dto.TopicoPorCategoriaDto(curso.categoria, count(t)) FROM Topico t JOIN t.curso curso group by curso.categoria")
    fun relatorio() : List<TopicoPorCategoriaDto>
}