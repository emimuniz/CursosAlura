fun main() {
  val lista = listOf(1, 1, 2, 3, 5, 8)
  
  println("Pegando o primeiro numero: "+ lista.first())
  println("Pegando somente o ultimo numero: " + lista.last())
  println("Pegando somente o penultimo numero: " + lista.elementAt(lista.count() -2))
  println("Pegando o index do numero: " + lista.indexOf(2))
  println("Quantidade de Numeros:"+ lista.count())
  println("Revertendo a lista:"+ lista.reversed())
  

}
