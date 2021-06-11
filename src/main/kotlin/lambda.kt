fun main() {

    // Lambda
    val l1: (Int) -> Int = { x -> x * 2 }

    // Lambda avec la variable implicite "it" (-> Un seul parametre)
    val l2: (Int) -> Int = { it * 2 }

    /***************************************************/

    val d1: List<Int> = listOf(5, 21, 3, 9)
    val d2 = modifyList(d1) { v -> v * 2 }
    val d3 = modifyList(d1) { it * 3 }
    val d4 = modifyList(d1) { x -> traitementComplexe(x) }
}

fun traitementComplexe(nb: Int): Int {
    if (nb % 2 == 0) {
        return nb * 3
    }
    return nb * 2 + nb
}

fun modifyList(values: List<Int>, lambda: (Int) -> Int): List<Int> {
    val result: MutableList<Int> = values.toMutableList();

    for (i in 0 until result.size) {
        result[i] = lambda(result[i])
    }

    return result.toList()
}
