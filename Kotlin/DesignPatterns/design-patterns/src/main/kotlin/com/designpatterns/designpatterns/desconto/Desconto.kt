package com.designpatterns.designpatterns.desconto

import com.designpatterns.designpatterns.orcamento.Orcamento
import java.math.BigDecimal
import kotlin.system.exitProcess


abstract class Desconto(var proximo: Desconto?) {
    fun calcular(orcamento: Orcamento): BigDecimal? {
        if(deveAplicar(orcamento)){
            return efetuarCalculo(orcamento)
        }
        return proximo?.calcular(orcamento)
    }

    abstract fun efetuarCalculo(orcamento: Orcamento): BigDecimal
    abstract fun deveAplicar(orcamento: Orcamento?): Boolean
}