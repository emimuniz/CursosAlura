var name = "Emillyn"
var greetting: String? = null


fun getGreeting() = "Hello Word" 

fun sayHello(greetting: String, itemToGreet: String): String {
    return "$greetting $itemToGreet"
}

fun main() {
    
    greetting = "hello"
   
	//val greettingToPrint = if(greetting != null) greetting else "Hi"
    
    val greettingToPrint = when(greetting){
        null -> println("Hi")
        else -> println(greetting)
    }
    
    
    if(greetting != null){
    	println(name)       
     
    }	
 	
	println(sayHello("Hi", "Emillyn"))
    println(getGreeting())
}
