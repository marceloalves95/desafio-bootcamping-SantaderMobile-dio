package desafios

import java.util.*

/**
 * @author RubioAlves
 * Created 23/06/2021 at 14:39
 */
fun main() {

    fun Double.format(digits: Long) = "%.${digits}f".format(this).replace(',','.')

    val (a, b, c) = readLine()!!.split(" ").map { it.toDouble() }

    val p = (a+b+c).format(1)
    val r = (((a+b) * c / 2 )).format(1)

    if (a < (b.plus(c)) &&  b < (a.plus(c)) &&  c < (a.plus(b))) println("Perimetro = $p")
    else println("Area = $r")


}

