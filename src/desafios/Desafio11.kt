package desafios

/**
 * @author RubioAlves
 * Created 23/06/2021 at 15:04
 */
fun main() {

    val valor = readLine()!!.toInt()
    decomporNumeros(valor)

}
val decomporNumeros:(Int) -> Unit = { valorReal ->

    val notaCem = mutableListOf<Int>()
    val notaCinquenta = mutableListOf<Int>()
    val notaVinte = mutableListOf<Int>()
    val notaDez = mutableListOf<Int>()
    val notaCinco = mutableListOf<Int>()
    val notaDois = mutableListOf<Int>()
    val notaUm = mutableListOf<Int>()

    var quociente:Int
    var total = valorReal
    var resto = total%100

    quociente = (total-resto)/100
    notaCem.add(quociente)

    total = resto
    resto %= 50
    quociente = (total-resto)/50
    notaCinquenta.add(quociente)

    total = resto
    resto = total%20
    quociente = (total-resto)/20
    notaVinte.add(quociente)

    total = resto
    resto = total%10
    quociente = (total-resto)/10
    notaDez.add(quociente)

    total = resto
    resto = total%5
    quociente = (total-resto)/5
    notaCinco.add(quociente)

    total = resto
    resto = total%2
    quociente = (total-resto)/2
    notaDois.add(quociente)

    total = resto
    resto = total%1
    quociente = (total-resto)/1
    notaUm.add(quociente)

    println("$valorReal")
    println("${notaCem[0]} nota(s) de R$ 100,00")
    println("${notaCinquenta[0]} nota(s) de R$ 50,00")
    println("${notaVinte[0]} nota(s) de R$ 20,00")
    println("${notaDez[0]} nota(s) de R$ 10,00")
    println("${notaCinco[0]} nota(s) de R$ 5,00")
    println("${notaDois[0]} nota(s) de R$ 2,00")
    println("${notaUm[0]} nota(s) de R$ 1,00")

}