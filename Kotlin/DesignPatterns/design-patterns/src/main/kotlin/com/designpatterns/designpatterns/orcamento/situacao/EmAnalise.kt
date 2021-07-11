package com.designpatterns.designpatterns.orcamento.situacao

import com.designpatterns.designpatterns.orcamento.Orcamento
import java.math.BigDecimal

class EmAnalise : SituacaoOrcamento(){
    fun calcularDescontoExtra(orcamento: Orcamento): BigDecimal{
        return orcamento.valor.multiply(BigDecimal("0.05"))
    }

    override fun aprovar(orcamento: Orcamento){
        orcamento.mudandoSituacao(Aprovado())
    }

    override fun reprovado(orcamento: Orcamento){
        orcamento.mudandoSituacao(Reprovado())
    }
}