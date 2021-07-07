package com.designpatterns.designpatterns

import com.designpatterns.designpatterns.desconto.CalculadoraDeDescontos
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
class DescontosTest {

    @Test
    fun `Ao enviar o salario devera retornar o  desconto se a quantidade de itens for maior que 5`(){
        val orcamento = Orcamento(BigDecimal("200"),6)
        val calculadora = CalculadoraDeDescontos()
        val imposto = calculadora.calcular(orcamento)

        Assertions.assertEquals(imposto, BigDecimal("20.0"))

    }

    @Test
    fun `Ao enviar o salario e quantidade devera retornar nenhum desconto se a quantidade de itens for menor que 5`(){
        val orcamento = Orcamento(BigDecimal("1000"), 1)
        val calculadora = CalculadoraDeDescontos()
        val imposto = calculadora.calcular(orcamento)

        Assertions.assertEquals(imposto, BigDecimal("100.0"))

    }
}