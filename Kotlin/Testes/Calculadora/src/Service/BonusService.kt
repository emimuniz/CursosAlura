package Service

import Modelo.Funcionario
import java.math.BigDecimal




class BonusService {
    fun calcularBonus(funcionario: Funcionario): BigDecimal? {
        var valor: BigDecimal = funcionario.salario.multiply(BigDecimal("0.1"))
        if (valor.compareTo(BigDecimal("1000")) > 0) {
            valor = BigDecimal.ZERO
        }
        return valor
    }
}