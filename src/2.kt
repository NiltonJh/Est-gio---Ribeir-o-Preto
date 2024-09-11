fun checkLetterA(input: String): Pair<Boolean, Int> {
    val count = input.count { it.equals('a', ignoreCase = true) }
    return Pair(count > 0, count)
}

fun main() {
    val inputString = "Abracadabra" // Pode ser alterado ou solicitado ao usuário
    val (exists, count) = checkLetterA(inputString)

    if (exists) {
        println("A letra 'a' existe na palavra escolhida e ocorre $count vezes.")
    } else {
        println("A letra 'a' não existe na palavra escolhida.")
    }
}