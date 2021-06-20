fun main(){
//    val idades = IntArray(4)
//    idades[0] = 20
//    idades[1] = 24
//    idades[2] = 30
//    idades[3] = 4

    val idades = intArrayOf(20, 24, 30, 4)

    var maiorIdade = 0
    for(idade in idades){
        if(idade > maiorIdade){
            maiorIdade  = idade
        }
    }

    println(maiorIdade)

    var menorIdade = idades[0]

    idades.forEach { idade ->
        if(idade <  menorIdade){
            menorIdade  = idade
        }
    }

    println(menorIdade)
}
