package com.designpatterns.designpatterns.desconto

import com.designpatterns.designpatterns.orcamento.Orcamento
import java.math.BigDecimal


class CalculadoraDeDescontos {

    fun calcular(orcamento: Orcamento?): BigDecimal? {
        val desconto: Desconto = DescontoQuantidadeItens(
            DescontoValorItens(SemDesconto())
        )
        return desconto.calcular(orcamento)
    }
}


