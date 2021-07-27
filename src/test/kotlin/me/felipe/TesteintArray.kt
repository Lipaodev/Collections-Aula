package me.felipe
fun main(){

    val values = IntArray (5)

    values [0] = 1
    values [1] = 11254
    values [2] = 3
    values [3] = 10
    values [4] = 25

    for (valor in values)
    println(valor)

    values.forEach {
        println(it)
    }

}



