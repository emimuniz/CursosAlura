package com.alura.demo.service

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

    fun cadastrar(form: TopicoForm) {
        val topico = topicoFormMapper.map(form)
        topico.id = topicos.size.toLong() + 1
        topicos =  topicos.plus(topico)

    }

}