fun main() {
    var sum: Int = 0
    for (i: Int in 1..999) if (i % 3 == 0 || i % 5 == 0) sum += i

    println("Answer = $sum") 
}