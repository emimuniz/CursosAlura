package com.designpatterns.designpatterns.desconto

import com.designpatterns.designpatterns.orcamento.Orcamento
import java.math.BigDecimal

class CalculadoraDeDescontos {

    fun calcular(orcamento: Orcamento): BigDecimal {
        if(orcamento.quantidade > 5){
            return orcamento.valor.multiply(BigDecimal("0.1"))
        }

        if(orcamento.valor > BigDecimal("500")){
            return orcamento.valor.multiply(BigDecimal("0.1"))
        }

        return BigDecimal.ZERO
    }
}


