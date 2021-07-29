package me.felipe //Aula de conjuntos (SET)

fun main() {
    val Joao = funcionario(nome = "Joao", salario = 2000.0, tipoContratacao = "CLT")
    val Pedro = funcionario(nome = "Pedro", salario = 1000.0, tipoContratacao = "PJ")
    val Maria = funcionario(nome = "Maria", salario = 4000.0, tipoContratacao = "CLT") //Instanciado tres objetos com valores especificos.

    val funcionarios1 = setOf(Joao,Pedro)
    val funcionarios2 = setOf(Maria)    //Cria um conjunto de objetos.



    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) } //Une todos os resultados num comando só


    println("++++++++++++++++++++++++++++++++++++++++++")
    val funcionarios3 = setOf(Joao,Pedro,Maria)
    val resultsubtract = funcionarios3.subtract(funcionarios2)
    resultsubtract.forEach { println(it) }  //Remove o valor solicitado do código

    println("++++++++++++++++++++++++++++++++++++++++++")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) } //Retorna o que há de comum entre os conjuntos

}