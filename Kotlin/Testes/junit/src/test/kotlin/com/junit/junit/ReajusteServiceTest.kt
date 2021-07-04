package com.junit.junit

import com.junit.junit.modelo.Desempenho
import com.junit.junit.modelo.Funcionario
import com.junit.junit.service.BonusService
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.math.BigDecimal
import java.time.LocalDate

class ReajusteServiceTest {

    private lateinit var service: ReajusteService
    private lateinit var funcionario: Funcionario

    @BeforeEach
    fun inicializar(){
        this.service = ReajusteService()
        this.funcionario =  Funcionario("Ana", LocalDate.now(), BigDecimal("1000"))

    }

    @Test
    fun reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar(){
        service.concederReajuste(funcionario, Desempenho.A_DESEJAR)

        assertEquals(BigDecimal("1030.00"), funcionario.salario)
    }

    @Test
    fun reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForBom(){
        service.concederReajuste(funcionario, Desempenho.BOM)

        assertEquals(BigDecimal("1150.00"), funcionario.salario)
    }
    @Test
    fun reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForOtimo(){
        service.concederReajuste(funcionario, Desempenho.OTIMO)

        assertEquals(BigDecimal("1200.00"), funcionario.salario)
    }
}