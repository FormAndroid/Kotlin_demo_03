fun main() {
    val test = calcDouble(10)


    val g = getGrade(17)
}


fun calcDouble(x: Int): Int = x * 2

fun calcDoubleComplete(x: Int): Int {
    // Version "classique"
    return x * 2
}

fun calcTriple(x: Int) = x * 3

fun isEvenText(nb: Int): String = if (nb % 2 == 0) "Pair" else "Impair"

fun isEvenTextComplete(nb: Int): String {
    // Version "classique"
    if (nb % 2 == 0)
        return "Pair"

    return "Impair"
}

fun getGrade(nb: Int): String = when (nb) {
    20 -> "E"
    18, 19 -> "TB"
    in 12..17 -> "B"
    10, 11 -> "S"
    in 7..9 -> "I"
    else -> "IG"
}