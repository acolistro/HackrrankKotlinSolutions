package thirty_days_of_code

import kotlin.io.*
import kotlin.text.*

/**
 * Given an integer, , perform the following conditional actions:

If 'n' is odd, print Weird
If 'n' is even and in the inclusive range of 2 to 5, print Not Weird
If 'n' is even and in the inclusive range of 6 to 20, print Weird
If 'n' is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not 'n' is weird.
 */

fun main(args: Array<String>) {
    val N = readLine()!!.trim().toInt()

    if (N % 2 == 1 || N % 2 == 0 && 6 <= N && N <= 20) {
        println("Weird")
    } else if (N % 2 == 0 && 2 <= N && N <= 5 || N > 20) {
        println("Not Weird")
    }
}
