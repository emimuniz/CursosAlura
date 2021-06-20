fun main() {
    println("Bem vindo ao ByteBank")
    val contaEmi = Conta()
    contaEmi.titular = "Emillyn"
    contaEmi.numero = 1000
    contaEmi.setSaldo(200.0)
    println(contaEmi.titular)
    println(contaEmi.numero)
    println(contaEmi.getSaldo())

    val contaAlice = Conta()
    contaAlice.titular = "Alice"
    contaAlice.numero = 1001
    contaAlice.setSaldo(300.0)
    println(contaAlice.titular)
    println(contaAlice.numero)
    println(contaAlice.getSaldo())

    println("Depositando na Conta da Emi")
    contaEmi.deposita(50.0)
    println(contaEmi.getSaldo())

    println("Depositando na Conta da Alice")
    contaAlice.deposita(70.0)
    println(contaAlice.getSaldo())

    println("Sacando da conta do Emi")
    contaEmi.saca(250.0)
    println(contaEmi.getSaldo())

    println("Sacando da conta da Alice")
    contaAlice.saca(100.0)
    println(contaAlice.getSaldo())

    println("Saque em excesso na conta da Emi")
    contaEmi.saca(100.0)
    println(contaEmi.getSaldo())

    println("Saque em excesso na conta da Alice")
    contaEmi.saca(500.0)
    println(contaAlice.getSaldo())

    println("Transferencia da conta da Alice para da Emi")
    if(contaAlice.transfere(100.0, contaEmi)){
        println("Transferencia Sucedida")
    }else{
        println("Falha na Transferencia")

    }
    println(contaEmi.getSaldo())
    println(contaAlice.getSaldo())


}


class Conta {
    var titular = ""
    var numero = 0
    private var saldo = 0.0


    fun deposita(valor: Double) {
        this.saldo += valor
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

    fun setSaldo(_valor: Double){
        saldo = _valor
    }

    fun getSaldo(): Double{
        return saldo
    }
}
