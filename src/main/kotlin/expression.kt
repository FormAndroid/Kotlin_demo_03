fun main() {
    val test =  calcDouble(10);

}


fun calcDouble(x: Int): Int = x * 2

fun calcDoubleComplete(x: Int) : Int {
    return x * 2
}

fun calcTriple(x: Int) = x * 3

fun isEvenText(nb: Int): String = if(nb % 2 == 0) "Pair" else "Impair"

fun getGrade(nb : Int) : String = when(nb) {
    10 -> "E"
    9 -> "TB"
    in 6..8 -> "B"
    5 -> "S"
    else -> "I"
}