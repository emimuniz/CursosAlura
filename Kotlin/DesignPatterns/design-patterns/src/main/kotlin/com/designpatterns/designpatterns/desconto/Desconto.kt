package com.designpatterns.designpatterns.desconto

import com.designpatterns.designpatterns.orcamento.Orcamento
import java.math.BigDecimal


abstract class Desconto(protected var proximo: Desconto?) {
    abstract fun calcular(orcamento: Orcamento?): BigDecimal?
}