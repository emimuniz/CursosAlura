package com.designpatterns.designpatterns.pedido

import com.designpatterns.designpatterns.desconto.DescontoQuantidadeItens
import com.designpatterns.designpatterns.orcamento.Orcamento
import java.math.BigDecimal
import java.time.LocalDateTime

class GeraPedido(val cliente: String, val valorOrcamento: BigDecimal, val quantidadeItens: Int)