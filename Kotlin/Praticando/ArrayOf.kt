fun main() {
	val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books") 
    
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))
    
    
    for(interestingThings in interestingThings){
        println("FOR IN " + interestingThings)
    }
    
    interestingThings.forEach{
        println("FOREACH " + it)
    }
    
    interestingThings.forEach{ interestingThing -> 
        println("FOREACH 2 " + interestingThing)
    }
    
   	interestingThings.forEachIndexed{ index,  interestingThing -> 
        println("FOREACH 3 " + "$interestingThing is at index $index")
    }
    
}
