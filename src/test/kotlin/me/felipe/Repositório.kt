package me.felipe

class Repositório<T> {
    private val map = mutableMapOf<String, T>()

    fun create (id: String, value: T) {
        map[id] = value
    }
    fun remove (id: String) = map.remove(id) //Remove um valor do mapa.

    fun findById (id: String) = map [id] //Repositório para simulação de banco de dados

    fun findAll() = map.values //Retorna todos os valores dentro do map

}