package com.alura.demo.service

import com.alura.demo.dto.TopicoForm
import com.alura.demo.dto.TopicoView
import com.alura.demo.model.Topico
import org.springframework.stereotype.Service
import java.util.stream.Collectors
import kotlin.collections.ArrayList

@Service
class TopicoService(
        private var topicos: List<Topico> = ArrayList(),
        private val cursoService: CursoService,
        private val usuarioService: UsuarioServive) {


    fun listar() :   List<TopicoView>{
       return topicos.stream().map {
           t -> TopicoView(
                id = t.id,
                titulo = t.titulo,
                mensagem = t.mensagem,
                dataCriacao = t.dataCriacao,
                status = t.status
           )
       }.collect(Collectors.toList())
    }

    fun buscarPorId(id: Long): TopicoView {
        val topico = topicos.stream().filter { t ->
            t.id == id
        }.findFirst().get()

        return TopicoView(
            id = topico.id,
            titulo = topico.titulo,
            mensagem = topico.mensagem,
            dataCriacao = topico.dataCriacao,
            status = topico.status
        )

    }

    fun cadastrar(dto: TopicoForm) {
        topicos =  topicos.plus(
            Topico(
                id = topicos.size.toLong() + 1,
                titulo = dto.titulo,
                mensagem = dto.mensagem,
                curso = cursoService.buscaPorId(dto.idCurso),
                autor = usuarioService.buscaPorId(dto.idAutor),
        ))

    }

}