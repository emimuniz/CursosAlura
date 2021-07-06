package com.designpatterns.designpatterns.imposto

import com.designpatterns.designpatterns.orcamento.Orcamento
import java.math.BigDecimal

interface Imposto {

    fun calcular(orcamento: Orcamento): BigDecimal

}