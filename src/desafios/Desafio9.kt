package desafios

/**
 * @author RubioAlves
 * Created 23/06/2021 at 15:02
 */
fun main() {

    val inteiros = mutableListOf<Int>()
    var soma:Int

    for (i in 1..readLine()!!.toInt()) {

        val list = readLine()!!.split(" ").map { it.toInt() }

        if (list.size == 2){

            soma = list[0] + list[1]
            inteiros.add(soma)

        }


    }
    for (i in inteiros){

        println(i)

    }


}