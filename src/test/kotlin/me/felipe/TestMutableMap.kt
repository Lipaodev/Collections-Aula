package me.felipe

fun main() {
    val Joao = funcionario(nome = "Joao", salario = 2000.0, tipoContratacao = "CLT")
    val Pedro = funcionario(nome = "Pedro", salario = 1000.0, tipoContratacao = "PJ")
    val Maria = funcionario(nome = "Maria", salario = 4000.0, tipoContratacao = "CLT")

    val repositório = Repositório<funcionario>()
    repositório.create( Joao.nome, Joao)
    repositório.create( Pedro.nome, Pedro)
    repositório.create( Maria.nome, Maria)

    println(repositório.findById(Joao.nome))

    println("---------------------")
    repositório.findAll().forEach { println(it) } //Buscando todos os elementos que estão gravados e imprimindo-os


    println("-----------------------")
    repositório.remove(Maria.nome)
    repositório.findAll().forEach { println(it) } //Realizou a remoção do valor maria no mapa e retorna todos os valores.


}