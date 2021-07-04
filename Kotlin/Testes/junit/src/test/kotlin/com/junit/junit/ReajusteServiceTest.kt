package com.junit.junit

import com.junit.junit.modelo.Desempenho
import com.junit.junit.modelo.Funcionario
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.math.BigDecimal
import java.time.LocalDate

class ReajusteServiceTest {

    @Test
    fun reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar(){
        val service = ReajusteService()
        val funcionario  = Funcionario("Ana", LocalDate.now(), BigDecimal("1000"))

        service.concederReajuste(funcionario, Desempenho.A_DESEJAR)
        assertEquals(BigDecimal("1030.00"), funcionario.salario)
    }

    @Test
    fun reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForBom(){
        val service = ReajusteService()
        val funcionario  = Funcionario("Ana", LocalDate.now(), BigDecimal("1000"))

        service.concederReajuste(funcionario, Desempenho.BOM)
        assertEquals(BigDecimal("1150.00"), funcionario.salario)
    }
    @Test
    fun reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForOtimo(){
        val service = ReajusteService()
        val funcionario  = Funcionario("Ana", LocalDate.now(), BigDecimal("1000"))

        service.concederReajuste(funcionario, Desempenho.OTIMO)
        assertEquals(BigDecimal("1200.00"), funcionario.salario)
    }
}