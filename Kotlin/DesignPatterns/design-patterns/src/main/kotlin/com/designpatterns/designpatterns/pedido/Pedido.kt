package com.designpatterns.designpatterns.pedido

import com.designpatterns.designpatterns.orcamento.Orcamento
import java.time.LocalDateTime

data class Pedido(val cliente: String, val data: LocalDateTime, val orcamento: Orcamento)