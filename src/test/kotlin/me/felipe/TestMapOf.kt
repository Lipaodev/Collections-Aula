package me.felipe

fun main(){
    val pair: Pair<String, Double> = Pair("Joao", 1000.0) // Função que permite voce passar um conjunto de valores, string e double por exemplo.
    val map1 = mapOf(pair) /* Criação de map com chave e valor*/

    map1.forEach { (k, v) -> println( "Chave: $k -- Valor:  $v") }

    val map2 = mapOf("Pedro" to 2500.0,
    "Maria" to 3000.0) //Kotlin possui um recurso chamado infix, que permite criar parametros os quais podemos inserir valores diferentes no mapa do teste por exemplo.

    map2.forEach { (k, v) -> println( "Chave: $k -- Valor:  $v") }

}