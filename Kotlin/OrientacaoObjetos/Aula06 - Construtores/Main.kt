fun main() {
    println("Bem vindo ao ByteBank")
    val contaEmi = Conta("Emillyn", 1000)
    contaEmi.deposita(200.0)
    println(contaEmi.titular)
    println(contaEmi.numero)
    println(contaEmi.saldo)

    val contaAlice = Conta("Alice", 1001)
    contaAlice.deposita(300.0)
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

    println("Transferencia da conta da Alice para da Emi")
    if(contaAlice.transfere(100.0, contaEmi)){
        println("Transferencia Sucedida")
    }else{
        println("Falha na Transferencia")

    }
    println(contaEmi.saldo)
    println(contaAlice.saldo)


}


class Conta(var titular: String, var numero: Int) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if(valor > 0 ) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }

        return false
    }

}
