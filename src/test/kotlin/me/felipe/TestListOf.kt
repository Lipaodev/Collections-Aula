package me.felipe

fun main() {
    val Joao = funcionario(nome = "Joao", salario = 2000.0, tipoContratacao = "CLT")
    val Pedro = funcionario(nome = "Pedro", salario = 1000.0, tipoContratacao = "PJ")
    val Maria = funcionario(nome = "Maria", salario = 4000.0, tipoContratacao = "CLT") //Instanciado tres objetos com valores especificos.

    val funcionarios = listOf(Joao, Pedro, Maria) //Atribuiu a uma lista

    funcionarios.forEach { println(it)} //Iterou a lista

    println("_______")
    println(funcionarios.find { it.nome == "Maria" }) //Buscou somente o objeto Maria

    println("_______")
    funcionarios
        .sortedBy { it.salario}//Organizado de forma crescente pelo salário.
        .forEach { println(it) } //Tem a responsabilidade de finalizar as informações.

    println("_______")

    funcionarios
        .groupBy { it.tipoContratacao} //Agrupa pelo tipo de contratacao
        .forEach { println(it) }    //Tem a responsabilidade de finalizar as informações.



}

    data class funcionario(
        val nome: String,
        val salario: Double, //Foi criado um data class com as variaveis
        val tipoContratacao: String,

        ) {
        override fun toString(): String =
            """
            Nome:    $nome
            Salario: $salario 
            
        """.trimIndent() // Função do kotlin que permite voce imprimir os valores de forma mais organizada na tela.

    }
