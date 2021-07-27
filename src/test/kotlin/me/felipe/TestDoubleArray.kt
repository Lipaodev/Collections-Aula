package me.felipe

fun main(){
    val salarios = DoubleArray(3)
    salarios[0]= 1000.0
    salarios[1]= 3000.0
    salarios[2]= 500.0

    salarios.forEach { println(it) } //forEach não indexado, não é possivel aumentar o salário

    println(  )
    salarios.forEachIndexed { index, salario ->//Nos da a garantia de que estamos alterando o valor do objeto no array
        salarios[index] = salario * 2
    }
    salarios.forEach { println(it) }

    println(  )
    val salarios2 = doubleArrayOf(2000.0, 1250.0, 5000.0) //Outra possível forma de criar o indice do array pelo doublearrayOF
    salarios2.sort()
    salarios2.forEach { println(it) }

    }