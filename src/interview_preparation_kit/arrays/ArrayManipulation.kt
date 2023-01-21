package interview_preparation_kit.arrays

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/**
 * Complete the 'arrayManipulation' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. 2D_INTEGER_ARRAY queries
 */

fun arrayManipulation(n: Int, queries: Array<Array<Int>>): Long {
    // Write your code here

    val outputArray = LongArray(n + 2)
    for (i in queries.indices) {
        val a = queries[i][0]
        val b = queries[i][1]
        val k = queries[i][2]
        outputArray[a] += k.toLong()
        outputArray[b + 1] -= k.toLong()
    }
    return getMax(outputArray)
}

/**
 * @param inputArray
 * @return
 */
private fun getMax(inputArray: LongArray): Long {
    var max = Long.MIN_VALUE
    var sum: Long = 0
    for (i in inputArray.indices) {
        sum += inputArray[i]
        max = Math.max(max, sum)
    }
    return max
}



fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val queries = Array<Array<Int>>(m, { Array<Int>(3, { 0 }) })

    for (i in 0 until m) {
        queries[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = arrayManipulation(n, queries)

    println(result)
}
