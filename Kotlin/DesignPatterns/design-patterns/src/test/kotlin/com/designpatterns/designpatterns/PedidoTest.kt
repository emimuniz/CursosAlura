package com.designpatterns.designpatterns

import com.designpatterns.designpatterns.imposto.CalculadoraDeImpostos
import com.designpatterns.designpatterns.imposto.ICMS
import com.designpatterns.designpatterns.orcamento.Orcamento
import com.designpatterns.designpatterns.pedido.GeraPedido
import com.designpatterns.designpatterns.pedido.GeraPedidoHandler
import com.designpatterns.designpatterns.pedido.Pedido
import org.junit.Test
import org.junit.jupiter.api.Assertions
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit4.SpringRunner
import java.math.BigDecimal
import java.time.LocalDateTime

@RunWith(SpringRunner::class)
@SpringBootTest
@ActiveProfiles("test")
class PedidoTest {

    @Test
    fun `Ao enviar o salario tera que salvar no banco de dados e enviar o email`(){
        val gerador = GeraPedido("Ana da Silva", BigDecimal("600"), 4)

        val geraPedidoHandler = GeraPedidoHandler(/*Dependencias*/)
        geraPedidoHandler.executa(gerador)
    }
}