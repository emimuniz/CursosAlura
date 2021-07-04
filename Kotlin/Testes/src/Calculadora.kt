fun main(){
    val calculadora = Calculadora()
    println(calculadora.somar(1,1))
}

class Calculadora{
    fun somar(a:Int, b:Int) = a + b
}