fun main(){
    println("Bem vindo ao ByteBank")
    val contaEmi = Conta()
    contaEmi.titular = "Emillyn"
    contaEmi.numero = 1000
    contaEmi.saldo = 200.0
    println(contaEmi.titular)
    println(contaEmi.numero)
    println(contaEmi.saldo)

    val contaAlice = Conta()
    contaAlice.titular = "Alice"
    contaAlice.numero = 1001
    contaAlice.saldo = 300.0
    println(contaAlice.titular)
    println(contaAlice.numero)
    println(contaAlice.saldo)

    println("Depositando na Conta da Emi")
    contaEmi.deposita(50.0)
    println(contaEmi.saldo)

    println("Depositando na Conta da Alice")
    contaAlice.deposita(70.0)
    println(contaAlice.saldo)

    println("Sacando da conta do Emi")
    contaEmi.saca(250.0)
    println(contaEmi.saldo)

    println("Sacando da conta da Alice")
    contaAlice.saca(100.0)
    println(contaAlice.saldo)

    println("Saque em excesso na conta da Emi")
    contaEmi.saca(100.0)
    println(contaEmi.saldo)

    println("Saque em excesso na conta da Alice")
    contaEmi.saca(500.0)
    println(contaAlice.saldo)

}


class Conta{
    var titular = ""
    var numero = 0
    var saldo = 0.0


    fun deposita(valor: Double){
        this.saldo += valor
    }

    fun saca(valor: Double){
        if(saldo >= valor){
            saldo -= valor
        }
    }
}
