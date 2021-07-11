package com.designpatterns.designpatterns.orcamento.situacao

import com.designpatterns.designpatterns.DomainException
import com.designpatterns.designpatterns.orcamento.Orcamento
import java.math.BigDecimal

abstract class SituacaoOrcamento {

    fun calcularValorDescontoExtra(orcamento: Orcamento): BigDecimal{
        return BigDecimal.ZERO
    }

    open fun aprovar(orcamento: Orcamento){
        throw DomainException("Orcamento nao pode ser aprovado!")
    }

    open fun reprovado(orcamento: Orcamento){
        throw DomainException("Orcamento nao pode ser reprovado!")
    }

    open fun finalizar(orcamento: Orcamento){
        throw DomainException("Orcamento nao pode ser finalizado!")
    }
}