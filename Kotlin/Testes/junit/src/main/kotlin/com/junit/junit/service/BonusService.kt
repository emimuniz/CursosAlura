package com.junit.junit.service

import com.junit.junit.modelo.Funcionario
import java.math.BigDecimal
import java.math.RoundingMode


class BonusService {
    fun calcularBonus(funcionario: Funcionario): BigDecimal {
        var valor = funcionario.salario.multiply(BigDecimal("0.1"))
        if (valor.compareTo(BigDecimal("1000")) > 0) {
            valor = BigDecimal.ZERO
        }
        return valor.setScale(2, RoundingMode.HALF_UP)
    }
}