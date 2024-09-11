fun fibonacciSequence(max: Int): List<Int> {
    val sequence = mutableListOf(0, 1)
    while (true) {
        val next = sequence[sequence.size - 1] + sequence[sequence.size - 2]
        if (next > max) break
        sequence.add(next)
    }
    return sequence
}

fun isFibonacciNumber(number: Int, sequence: List<Int>): Boolean {
    return sequence.contains(number)
}

fun main() {
    val numberToCheck = 29 // Pode ser alterado ou solicitado ao usuário
    val fibonacciSeq = fibonacciSequence(numberToCheck)
    val belongsToFibonacci = isFibonacciNumber(numberToCheck, fibonacciSeq)

    if (belongsToFibonacci) {
        println("O número $numberToCheck pertence à sequência de Fibonacci.")
    } else {
        println("O número $numberToCheck não pertence à sequência de Fibonacci.")
    }
}