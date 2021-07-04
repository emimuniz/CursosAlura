package com.junit.junit

import com.junit.junit.modelo.Funcionario
import com.junit.junit.service.BonusService
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import java.lang.IllegalArgumentException
import java.math.BigDecimal
import java.time.LocalDate

class BonusServiceTest {

    private lateinit var service: BonusService

    @BeforeEach
    fun inicializar(){
        this.service = BonusService()
    }
    @AfterEach
    fun finalizar(){
        this.service = BonusService()
    }

    @Test
    fun bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto(){
        val funcionario = Funcionario("Rodrigo", LocalDate.now(), BigDecimal(25000))

        val exception = assertThrows(IllegalArgumentException::class.java) {
            service.calcularBonus(funcionario)
        }
        assertEquals("Funcionario com salario maior que 1000 reais não pode receber o bonus", exception.message)
    }

    @Test
    fun bonusDeveriaSerDezPorCentoDoSalario(){
        val funcionario = Funcionario("Rodrigo", LocalDate.now(), BigDecimal(2500))
        val bonus = service.calcularBonus(funcionario)

        assertEquals(BigDecimal("250.00"), bonus)
    }

    @Test
    fun bonusDeveriaSerDezPorCentoParaSalarioExatamente1000(){
        val funcionario = Funcionario("Rodrigo", LocalDate.now(), BigDecimal(1000))
        val bonus = service.calcularBonus(funcionario)

        assertEquals(BigDecimal("100.00"), bonus)
    }


}