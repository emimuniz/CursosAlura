package com.junit.junit.service

import com.junit.junit.modelo.Funcionario
import java.lang.IllegalArgumentException
import java.math.BigDecimal
import java.math.RoundingMode


class BonusService {
    fun calcularBonus(funcionario: Funcionario): BigDecimal {
        val valor = funcionario.salario.multiply(BigDecimal("0.1"))
        if (valor > BigDecimal("1000")) {
            throw IllegalArgumentException("Funcionario com salario maior que 1000 reais não pode receber o bonus")
        }
        return valor.setScale(2, RoundingMode.HALF_UP)
    }
}