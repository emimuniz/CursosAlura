package com.junit.junit.modelo

import java.math.BigDecimal
import java.math.RoundingMode
import java.time.LocalDate


class Funcionario(val nome: String, val dataAdmissao: LocalDate, var salario: BigDecimal) {
    fun reajustarSalario(reajuste: BigDecimal) {
        this.salario += reajuste.setScale(2, RoundingMode.HALF_UP)
    }
}
