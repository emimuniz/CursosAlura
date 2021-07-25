var sobrenome = "Silva" //mutavel
var idade: Int? = null
fun main(){
    val name: String = "Emillyn" //imutavel
    sobrenome = "Kate"
    val idadeTrue = if(idade != null) idade else "Não passado"
    println(idadeTrue)
    
    when(sobrenome){
        null -> println("Silva")
        else -> println(sobrenome)
    }
    
    
    if(idade != null){
        println(idade)
    }else{
     	println("50")   
    }
    
    println(name)
    println(sobrenome)
}
