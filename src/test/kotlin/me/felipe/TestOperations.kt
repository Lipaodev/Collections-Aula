package me.felipe

fun main(){
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios){
        println(salario)

        println("-----------------")
        println("Maior Salario: ${salarios.maxOrNull()}") //Salarios maximo no range
        println("Menor Salario: ${salarios.minOrNull()}") //Salario minimo no range
        println("Media Salario: ${salarios.average()}") //Media salarial

        val salariosMaiorQue2500 = salarios.filter { it > 2500.0 } //Filtro para busca de salario maior que o valor especificado
        println("-----------------")
        salariosMaiorQue2500.forEach {println(it)} //Imprime o valor do salario maior que o especificado

        println("-----------------")
        println(salarios.count{ it in 2000.0..5000.0}) //Conta a quantidade de salários no range espeficado.

        println("-----------------")
        println(salarios.find { it == 2250.0}) //Busca exatamente o valor especificado e exibe valor
        println(salarios.find { it == 250.0}) //Busca exatamente o valor especificado  e exibe o valor

        println("-----------------")
        println(salarios.any { it == 1000.0}) //Busca exatamente o valor especificado e validade de se é verdadeiro ou não
        println(salarios.any { it == 500.0}) //Busca exatamente o valor especificado e validade de se é verdadeiro ou não






    }
}