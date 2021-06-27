package com.alura.demo.service

import com.alura.demo.dto.AtualizarTopicoForm
import com.alura.demo.dto.TopicoForm
import com.alura.demo.dto.TopicoView
import com.alura.demo.exception.NotFoundException
import com.alura.demo.mapper.TopicoFormMapper
import com.alura.demo.mapper.TopicoViewMapper
import com.alura.demo.model.Topico
import com.alura.demo.repository.TopicoRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service
import java.util.stream.Collectors
import kotlin.collections.ArrayList

@Service
class TopicoService(
        private val repository: TopicoRepository,
        private val topicoViewMapper: TopicoViewMapper,
        private val topicoFormMapper: TopicoFormMapper,

) {

    private val notFoundMessage: String = "Topico não encontrado!"

    fun listar(
        nomeCurso: String?,
        paginacao: Pageable
    ) :   Page<TopicoView>{
        val topicos = if(nomeCurso == null){
            repository.findAll(paginacao)
        }else{
            repository.findByCursoNome(nomeCurso, paginacao)
        }
       return topicos.map {
           t -> topicoViewMapper.map(t)
       }
    }

    fun buscarPorId(id: Long): TopicoView {
        val topico = repository.findById(id).orElseThrow{NotFoundException(notFoundMessage)}

        return topicoViewMapper.map(topico)

    }

    fun cadastrar(form: TopicoForm) : TopicoView{
        val topico = topicoFormMapper.map(form)
        repository.save(topico)
        return topicoViewMapper.map(topico)
    }

    fun atualizar(form: AtualizarTopicoForm) : TopicoView{
        val topico = repository.findById(form.id).orElseThrow{NotFoundException(notFoundMessage)}
        topico.titulo = form.titulo
        topico.mensagem = form.mensagem
        return topicoViewMapper.map(topico)
    }

    fun deletar(id: Long) {
        repository.deleteById(id)
    }

}