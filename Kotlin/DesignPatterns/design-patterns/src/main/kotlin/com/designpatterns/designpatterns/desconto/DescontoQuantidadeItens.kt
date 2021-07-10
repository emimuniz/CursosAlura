package com.designpatterns.designpatterns.desconto

import com.designpatterns.designpatterns.orcamento.Orcamento
import java.math.BigDecimal


class DescontoQuantidadeItens(proximo: Desconto?) : Desconto(proximo!!) {

    override fun efetuarCalculo(orcamento: Orcamento) = orcamento.valor.multiply(BigDecimal("0.1"))

    override fun deveAplicar(orcamento: Orcamento?) =  orcamento!!.quantidade > 5

}