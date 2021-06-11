fun main(args: Array<String>) {

    val res1 = multi(12, 2)
    val res2 = multi(11, 2, 3)
    val res3 = multi(1, 2, nb4 = 5)

    // f6 -> 6 * 5 * 4 * 3 * 2 * 1 -> 720
    val f6 = factoriel(6)
    println(f6)


    val d = calcDouble(21)
    println(d)
}

fun factoriel(value: Int): Int {
    if(value < 3) { // Condition de l'appel recursif
        return value
    }

    return value * factoriel(value - 1)
}

fun multi(nb1: Int, nb2: Int, nb3: Int = 10, nb4: Int = 1): Int {

    return nb1 * nb2 * nb3
}

