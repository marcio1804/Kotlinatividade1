fun main() {
 var idade1 = 24
 idade1 = 24
 var altura: Double = 1.76
 var nome: String = "Marcio"

 var idade2 = 20
 idade2 = 20
 var altura2: Double = 1.72
 var nome2: String = "João"

 println("O $nome tem $idade1 anos e $altura de altura")
 var eEstudante1: Boolean = true
 if (eEstudante1 == true) {
  println("É estudante: $eEstudante1")
 } else {
  println("Não é estudante: $eEstudante1")
 }
 println("O $nome2 tem $idade2 anos e $altura2 de altura")
 var eEstudante2: Boolean = false

 if (eEstudante2 == true) {
  println("É estudante: $eEstudante2")
 } else {
  println("Não é estudante: $eEstudante2")
 }
 saudacao("Marcio")
 val resultado = soma(24, 20)
 println("A soma é: $resultado")
}

fun saudacao(nome: String) {
 println("Olá $nome a soma das idades é!")
}

 fun soma(a: Int, b: Int): Int {
  return a + b

}