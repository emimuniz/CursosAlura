package com.designpatterns.designpatterns.imposto

import com.designpatterns.designpatterns.orcamento.Orcamento
import java.math.BigDecimal

class ISS : Imposto{

    override fun calcular(orcamento: Orcamento) : BigDecimal {
        return orcamento.valor.multiply(BigDecimal("0.06"))
    }
}