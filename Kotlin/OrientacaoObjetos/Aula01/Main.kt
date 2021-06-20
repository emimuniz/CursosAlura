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

}

class Conta{
    var titular = ""
    var numero = 0
    var saldo = 0.0
}
