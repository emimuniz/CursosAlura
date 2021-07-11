package com.designpatterns.designpatterns.orcamento

import com.designpatterns.designpatterns.orcamento.situacao.EmAnalise
import com.designpatterns.designpatterns.orcamento.situacao.SituacaoOrcamento
import java.math.BigDecimal

data class Orcamento(var valor: BigDecimal, val quantidade: Int, var situacao: SituacaoOrcamento = EmAnalise()){

    fun aplicarDescontoExtra(){
        val valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this)
        this.valor = this.valor.subtract(valorDoDescontoExtra)
    }

    fun aprovar(){
        this.situacao.aprovar(this)
    }
    fun reprovar(){
        this.situacao.reprovado(this)
    }
    fun finalizar(){
        this.situacao.finalizar(this)
    }

    fun mudandoSituacao(situacao: SituacaoOrcamento){
        this.situacao = situacao
    }
}