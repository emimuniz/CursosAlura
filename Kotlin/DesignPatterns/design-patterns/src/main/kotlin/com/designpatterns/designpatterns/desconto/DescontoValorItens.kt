package com.designpatterns.designpatterns.desconto

import com.designpatterns.designpatterns.orcamento.Orcamento
import java.math.BigDecimal


class DescontoValorItens(proximo: Desconto?) : Desconto(proximo!!) {

    override fun calcular(orcamento: Orcamento?): BigDecimal? {
         if (orcamento!!.valor > BigDecimal("500")) {
            return orcamento.valor.multiply(BigDecimal("0.05"))
        }

        return proximo!!.calcular(orcamento)
    }
}