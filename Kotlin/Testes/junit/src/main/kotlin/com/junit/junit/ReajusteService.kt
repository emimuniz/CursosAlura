package com.junit.junit

import com.junit.junit.modelo.Desempenho
import com.junit.junit.modelo.Funcionario
import java.math.BigDecimal

class ReajusteService {
    fun concederReajuste(funcionario: Funcionario, desempenho: Desempenho) {
        val percentual = desempenho.percentualReajuste();
        val reajuste = funcionario.salario.multiply(percentual)
        funcionario.reajustarSalario(reajuste)
    }

}
