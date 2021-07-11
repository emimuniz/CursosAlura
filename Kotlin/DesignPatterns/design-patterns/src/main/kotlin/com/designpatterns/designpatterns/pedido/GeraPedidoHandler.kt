package com.designpatterns.designpatterns.pedido

import com.designpatterns.designpatterns.orcamento.Orcamento
import java.time.LocalDateTime

class GeraPedidoHandler {

    //constructor com injeção de dependencias: repository, service etc..

    fun executa(dados: GeraPedido){

        val orcamento = Orcamento(dados.valorOrcamento, dados.quantidadeItens)
        val pedido = Pedido(dados.cliente, LocalDateTime.now(), orcamento)

        println("Salvar pedido no banco de Dados ")
        println("Enviar email com os dados do novo pedido")
    }
}