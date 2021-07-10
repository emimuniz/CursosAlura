package com.designpatterns.designpatterns.desconto

import com.designpatterns.designpatterns.orcamento.Orcamento
import java.math.BigDecimal


class SemDesconto : Desconto(null) {
    override fun efetuarCalculo(orcamento: Orcamento): BigDecimal {
        return BigDecimal.ZERO
    }

    override fun deveAplicar(orcamento: Orcamento?) = true
}