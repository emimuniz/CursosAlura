import org.junit.Assert
import org.junit.Test

class CalculadoraTest {

    @Test
    fun DeveriaSomarDoisNumerosPositivos(){
        val cal =  Calculadora();
        val soma = cal.somar(3,7)

        Assert.assertEquals(10, soma)
    }
}