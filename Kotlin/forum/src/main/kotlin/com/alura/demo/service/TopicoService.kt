package com.alura.demo.service

import com.alura.demo.dto.TopicoDTO
import com.alura.demo.model.Topico
import org.springframework.stereotype.Service
import kotlin.collections.ArrayList

@Service
class TopicoService(
        private var topicos: List<Topico> = ArrayList(),
        private val cursoService: CursoService,
        private val usuarioService: UsuarioServive) {


    fun listar() :   List<Topico>{
       return topicos
    }

    fun buscarPorId(id: Long): Topico {
        return topicos.stream().filter { t ->
            t.id == id
        }.findFirst().get()

    }

    fun cadastrar(dto: TopicoDTO) {
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