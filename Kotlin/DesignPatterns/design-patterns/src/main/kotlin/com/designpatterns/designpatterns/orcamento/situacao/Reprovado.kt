package com.designpatterns.designpatterns.orcamento.situacao

import com.designpatterns.designpatterns.orcamento.Orcamento
import java.math.BigDecimal

class Reprovado : SituacaoOrcamento(){

     override fun finalizar(orcamento: Orcamento){
        orcamento.mudandoSituacao(Finalizado())
    }
}