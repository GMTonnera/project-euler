import kotlin.math.sqrt

val N: Long = 600851475143

fun main() {
    var l: MutableList<Int> = listPrimes(N)
    for (p in l.reversed()){
        if (N % p == 0.toLong()) {
            println("Answer = $p")
            break
        }
    }
}

fun listPrimes(n: Long): MutableList<Int> {
    val max: Int = sqrt(n.toDouble()).toInt()
    var primes: MutableList<Int> = mutableListOf(2, 3, 5, 7)
    for (i: Int in 8..max) {
        var flag: Boolean = true
        for (p: Int in primes) {
            if (i % p == 0) {
                flag = false
                break
            }
        }
        if (flag) primes.add(i)
    }
    return primes
}