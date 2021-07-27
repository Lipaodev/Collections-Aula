package me.felipe
fun main(){

    val values = IntArray (5)

    values [0] = 1
    values [1] = 11254
    values [2] = 3
    values [3] = 10
    values [4] = 25

    for (valor in values) {
        println(valor)
        //Forma padrao de referenciar a variavel e chamar ela
    }

    println("--------------------")
    values.forEach { valor ->
        println(valor)
        //Printa o valor da variavel valor sem precisar chamar a val values
    }

        println("-----------------")
        for (index in values.indices) {
            println(values[index])
            //Evidencia o índice, e após o valor dos índices
        }

        println("-----------------")
        values.sort()
        for (valor in values){
            println(valor)
            //Ordena os valores do menor para o maior com a função sort!!


    }

}



