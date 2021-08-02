
package me.felipe

import java.math.BigDecimal

fun Array<BigDecimal>.somatoria() = this.reduce{
    acc, valor -> acc + valor
}
fun Array<BigDecimal>.media() =
    if (this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal() //Criado duas funções extendidas que não estavam presentes no leque de funções