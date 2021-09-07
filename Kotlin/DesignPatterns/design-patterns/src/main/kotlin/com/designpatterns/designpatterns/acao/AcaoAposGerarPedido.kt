package com.designpatterns.designpatterns.acao

import com.designpatterns.designpatterns.pedido.Pedido

interface AcaoAposGerarPedido {
        fun executar(pedido: Pedido);
}
