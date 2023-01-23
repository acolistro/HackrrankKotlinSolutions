package thirty_days_of_code

import kotlin.io.*
import kotlin.text.*

/**
 * Complete the 'factorial' function below.
 *  Be sure to use recursion.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER n as parameter.
 *
 * I used the tutorial but was having issues when using 0,
 * either it had a scope related error or a type error related to 'unit'.
 * Changing 0 to 1 worked.
 */

fun factorial(n: Int): Int {
    // Write your code here
    return if (n >= 1) n * factorial(n - 1) else 1
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val result = factorial(n)

    println(result)
}
