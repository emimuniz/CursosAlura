package com.designpatterns.designpatterns.desconto

import com.designpatterns.designpatterns.orcamento.Orcamento
import java.math.BigDecimal


class CalculadoraDeDescontos {

    fun calcular(orcamento: Orcamento): BigDecimal? {
        val cadeiaDeDescontos: Desconto = DescontoQuantidadeItens(
            DescontoValorItens(SemDesconto())
        )
        return cadeiaDeDescontos.calcular(orcamento)
    }
}


