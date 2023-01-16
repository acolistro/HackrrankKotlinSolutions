package interview_preparation_kit.arrays

/** New Years Chaos - Minimum Bribes - Medium - Problem Solving (basic) */

import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/**
 *
 * It is New Year's Day and people are in line for the Wonderland roller coaster ride.
 * Each person wears a sticker indicating their initial position in the queue from 1 to 'n'.
 * Any person can bribe the person directly in front of them to swap positions,
 * but they still wear their original sticker. One person can bribe at most two others.
 * Determine the minimum number of bribes that took place to get to a given queue order.
 * Print the number of bribes, or, if anyone has bribed more than two people, print Too chaotic.
 *
 * Complete the 'minimumBribes' function below.
 *
 * The function accepts INTEGER_ARRAY q as parameter.
 */

fun minimumBribes(q: Array<Int>): Unit {
    // Write your code here
    var minimumBribes = 0
    for (i in q.size - 1 downTo 0) {
        if (q[i] - (i + 1) > 2) {
            println("Too chaotic")
            return
        }
        for (j in maxOf(0, q[i] - 2) until i)
            if (q[j] > q[i])
                minimumBribes++
    }
    println(minimumBribes)

}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val n = readLine()!!.trim().toInt()

        val q = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

        minimumBribes(q)
    }
}
