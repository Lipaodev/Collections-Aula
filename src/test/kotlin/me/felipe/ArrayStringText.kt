package me.felipe

fun main(){
    val nomes = Array <String> ( 5 ){""}
    nomes[0] = "Maria"
    nomes[1] = "Zoao"
    nomes[2] = "José"

    for (name in nomes){
        println(name)
    }

    println(  )
    nomes.sort()
    nomes.forEach { println(it) }  //forEach precisa ser refenciado o nome do objeto apenas em projetos que possuam vários arrays, para que não fique repetido o "IT"

    val nomes2 = arrayOf("Maria", "Zoao", "Pedro") //Forma mais simplificada de fazer a instânciação do array.
    println(  )
    nomes2.sort()
    nomes2.forEach { println(it) }
}