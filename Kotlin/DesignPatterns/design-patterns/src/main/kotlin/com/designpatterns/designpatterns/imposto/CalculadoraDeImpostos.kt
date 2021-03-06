package com.designpatterns.designpatterns.imposto

import com.designpatterns.designpatterns.orcamento.Orcamento
import java.math.BigDecimal

class CalculadoraDeImpostos {

    fun calcular(orcamento: Orcamento, imposto: Imposto) : BigDecimal {
        return imposto.calcular(orcamento)
    }

}