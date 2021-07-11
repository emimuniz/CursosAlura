package com.designpatterns.designpatterns.orcamento.situacao

import com.designpatterns.designpatterns.DomainException
import com.designpatterns.designpatterns.orcamento.Orcamento
import java.math.BigDecimal

class Aprovado : SituacaoOrcamento() {
    fun calcularDescontoExtra(orcamento: Orcamento): BigDecimal{
        return orcamento.valor.multiply(BigDecimal("0.05"))
    }

    override fun finalizar(orcamento: Orcamento){
        orcamento.mudandoSituacao(Finalizado())
    }

}