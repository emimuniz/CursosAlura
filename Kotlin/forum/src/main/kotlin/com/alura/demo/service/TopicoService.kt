package com.alura.demo.service

import com.alura.demo.dto.AtualizarTopicoForm
import com.alura.demo.dto.TopicoForm
import com.alura.demo.dto.TopicoView
import com.alura.demo.mapper.TopicoFormMapper
import com.alura.demo.mapper.TopicoViewMapper
import com.alura.demo.model.Topico
import org.springframework.stereotype.Service
import java.util.stream.Collectors
import kotlin.collections.ArrayList

@Service
class TopicoService(
        private var topicos: List<Topico> = ArrayList(),
        private val topicoViewMapper: TopicoViewMapper,
        private val topicoFormMapper: TopicoFormMapper
) {


    fun listar() :   List<TopicoView>{
       return topicos.stream().map {
           t -> topicoViewMapper.map(t)
       }.collect(Collectors.toList())
    }

    fun buscarPorId(id: Long): TopicoView {
        val topico = topicos.stream().filter { t ->
            t.id == id
        }.findFirst().get()

        return topicoViewMapper.map(topico)

    }

    fun cadastrar(form: TopicoForm) : TopicoView{
        val topico = topicoFormMapper.map(form)
        topico.id = topicos.size.toLong() + 1
        topicos =  topicos.plus(topico)
        return topicoViewMapper.map(topico)
    }

    fun atualizar(form: AtualizarTopicoForm) : TopicoView{
        val topico = topicos.stream().filter { t ->
            t.id == form.id
        }.findFirst().get()

        val topicoAtualizado = Topico(
            id = form.id,
            titulo = form.titulo,
            mensagem = form.mensagem,
            autor = topico.autor,
            curso = topico.curso,
            respostas = topico.respostas,
            status = topico.status,
            dataCriacao = topico.dataCriacao
        )

        topicos = topicos.minus(topico).plus(topicoAtualizado)

        return topicoViewMapper.map(topicoAtualizado)
    }

    fun deletar(id: Long) {
        val topico = topicos.stream().filter { t ->
            t.id == id
        }.findFirst().get()
        topicos = topicos.minus(topico)
    }

}