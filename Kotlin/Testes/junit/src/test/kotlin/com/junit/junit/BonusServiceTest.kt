package com.junit.junit

import com.junit.junit.modelo.Funcionario
import com.junit.junit.service.BonusService
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.math.BigDecimal
import java.time.LocalDate

class BonusServiceTest {

    @Test
    fun bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto(){
        val service = BonusService();
        val funcionario = Funcionario("Rodrigo", LocalDate.now(), BigDecimal(25000))
        val bonus = service.calcularBonus(funcionario)

        assertEquals(BigDecimal("0.00"), bonus)
    }

    @Test
    fun bonusDeveriaSerDezPorCentoDoSalario(){
        val service = BonusService();
        val funcionario = Funcionario("Rodrigo", LocalDate.now(), BigDecimal(2500))
        val bonus = service.calcularBonus(funcionario)

        assertEquals(BigDecimal("250.00"), bonus)
    }

    @Test
    fun bonusDeveriaSerDezPorCentoParaSalarioExatamente1000(){
        val service = BonusService();
        val funcionario = Funcionario("Rodrigo", LocalDate.now(), BigDecimal(1000))
        val bonus = service.calcularBonus(funcionario)

        assertEquals(BigDecimal("100.00"), bonus)
    }


}