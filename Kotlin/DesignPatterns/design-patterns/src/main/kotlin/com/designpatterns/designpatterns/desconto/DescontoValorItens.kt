package com.designpatterns.designpatterns.desconto

import com.designpatterns.designpatterns.orcamento.Orcamento
import java.math.BigDecimal


class DescontoValorItens(proximo: Desconto?) : Desconto(proximo!!) {

    override fun efetuarCalculo(orcamento: Orcamento) = orcamento.valor.multiply(BigDecimal("0.05"))

    override fun deveAplicar(orcamento: Orcamento?) = orcamento!!.valor > BigDecimal("500")

}