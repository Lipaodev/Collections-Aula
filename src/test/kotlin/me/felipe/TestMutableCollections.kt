package me.felipe

fun main() {
    val Joao = funcionario(nome = "Joao", salario = 2000.0, tipoContratacao = "CLT")
    val Pedro = funcionario(nome = "Pedro", salario = 1000.0, tipoContratacao = "PJ")
    val Maria = funcionario(nome = "Maria", salario = 4000.0, tipoContratacao = "CLT")

    val funcionarios = mutableListOf(Joao, Maria) //Mutable list, que é possível realizar alterações nela, de adição ou subtração.
    funcionarios.forEach { println(it) }

    println("------------")

    funcionarios.add(Pedro) //Comando para adicionar um "Funcionario" na lista
    funcionarios.forEach { println(it) }

    println("------------")

    funcionarios.remove(Joao) //Comando para subtrair um "Funcionario" na lista
    funcionarios.forEach { println(it) }

    println("------SET------------")
    val funcionarioSet = mutableSetOf(Joao)
    funcionarioSet .forEach { println(it) }

    println("------SET------------")
    funcionarioSet.add(Pedro)
    funcionarioSet.add(Maria)
    funcionarioSet.forEach { println(it) }

}