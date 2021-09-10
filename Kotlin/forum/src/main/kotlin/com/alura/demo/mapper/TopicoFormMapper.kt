package com.alura.demo.mapper

import com.alura.demo.dto.TopicoForm
import com.alura.demo.model.Topico
import com.alura.demo.service.CursoService
import com.alura.demo.service.UsuarioService
import org.springframework.stereotype.Component

@Component
class TopicoFormMapper(
    private val cursoService: CursoService,
    private val usuarioService: UsuarioService
) : Mapper<TopicoForm, Topico> {
    override fun map(t: TopicoForm): Topico {
        return Topico(
            titulo = t.titulo,
            mensagem = t.mensagem,
            curso = cursoService.buscaPorId(t.idCurso),
            autor = usuarioService.buscaPorId(t.idAutor),
        )
    }

}
