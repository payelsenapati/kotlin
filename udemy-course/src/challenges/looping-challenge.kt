package codeChallenge2

fun main() {
    var sum: Long = 0

    for (num in 100..100000) {
        sum += num
    }

    println("sum of all numbers from 100 to 100,000 is $sum")
}
