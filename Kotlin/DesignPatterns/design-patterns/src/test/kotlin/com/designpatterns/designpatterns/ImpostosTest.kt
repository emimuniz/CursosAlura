package com.designpatterns.designpatterns

import com.designpatterns.designpatterns.imposto.CalculadoraDeImpostos
import com.designpatterns.designpatterns.imposto.ICMS
import com.designpatterns.designpatterns.imposto.ISS
import com.designpatterns.designpatterns.orcamento.Orcamento
import org.junit.jupiter.api.Assertions
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit4.SpringRunner
import java.math.BigDecimal


@RunWith(SpringRunner::class)
@SpringBootTest
@ActiveProfiles("test")
class ImpostosTest {

    @Test
    fun `Ao enviar o salario tera que retornar o valor do imposto de ICMS`(){
        val orcamento = Orcamento(BigDecimal("100"),1)
        val calculadora = CalculadoraDeImpostos()
        val imposto = calculadora.calcular(orcamento, ICMS())

        Assertions.assertEquals(imposto, BigDecimal("10.0"))

    }

    @Test
    fun `Ao enviar o salario tera que retornar o valor do imposto De ISS`(){
        val orcamento = Orcamento(BigDecimal("100"), 1)
        val calculadora = CalculadoraDeImpostos()
        val imposto = calculadora.calcular(orcamento, ISS())

        Assertions.assertEquals(imposto, BigDecimal("6.00"))

    }
}