package com.designpatterns.designpatterns.imposto

import com.designpatterns.designpatterns.orcamento.Orcamento
import java.math.BigDecimal

class CalculadoraDeImpostos {

    fun calcular(orcamento: Orcamento, tipoImposto: TipoImposto) =

        when(tipoImposto){
            TipoImposto.ICMS -> orcamento.valor.multiply(BigDecimal("0.1"))
            TipoImposto.ISS ->  orcamento.valor.multiply(BigDecimal("0.06"))
        }
}