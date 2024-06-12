import java.util.Scanner

fun main() {
    var sum: Int = 0
    for (i: Int in 1..35) {
        val a_i: Int = fibonacci(i)

        if (a_i < 4000000 && a_i % 2 == 0) sum += a_i
        else if(a_i < 4000000 && a_i % 2 != 0) continue 
        else break
    }
    println("Answer = $sum")
}

fun fibonacci(n: Int): Int {
    if (n in listOf(0, 1)) return n
    return fibonacci(n-1) + fibonacci(n-2)
}