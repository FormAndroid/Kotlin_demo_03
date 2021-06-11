fun main(args: Array<String>) {

    val res1 = multi(12, 2)
    val res2 = multi(11, 2, 3)
    val res3 = multi(1, 2, nb4 = 5)
    val res4 = multi(5, 5, nb3 = 5)

    // f6 -> 6 * 5 * 4 * 3 * 2 * 1 -> 720
    val f6 = factoriel(6)
    println(f6)


    val d = calcDouble(21)
    println(d)


    val maList: List<Int> = listOf(5, 6, 2, 5, 4, 2, 1, 5)
    println(maList.joinToString(">"))
}

fun factoriel(value: Int): Int {
    if (value < 3) { // Condition de l'appel recursif
        return value
    }

    return value * factoriel(value - 1)
}

fun multi(nb1: Int, nb2: Int, nb3: Int = 10, nb4: Int = 1): Int {

    return nb1 * nb2 * nb3 * nb4
}

