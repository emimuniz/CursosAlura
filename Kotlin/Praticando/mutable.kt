	val interestingThings = mutableListOf("Kotlin", "Programming", "Comic Books") 
    interestingThings.add("Dogs")
    
    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")	
    map.put(4, "d")
    map.forEach{key, value -> println("$key -> $value")}
