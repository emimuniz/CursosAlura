package com.designpatterns.designpatterns.desconto

import com.designpatterns.designpatterns.orcamento.Orcamento
import java.math.BigDecimal


class DescontoQuantidadeItens(proximo: Desconto?) : Desconto(proximo!!) {

    override fun calcular(orcamento: Orcamento?): BigDecimal? {
         if (orcamento!!.quantidade > 5) {
            return orcamento.valor.multiply(BigDecimal("0.1"))
        }
        return proximo?.calcular(orcamento)
    }
}