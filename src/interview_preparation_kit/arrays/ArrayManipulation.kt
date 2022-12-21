package interview_preparation_kit.arrays

import java.util.*

/**
 * Challenge:
Starting with a 1-indexed array of zeros and a list of operations,
for each operation add a value to each the array element between two given indices,
inclusive. Once all operations have been performed,
return the maximum value in the array.

 Support resource for solution: https://stackoverflow.com/questions/56249944/array-manipulation-hackerrank-questions-java
 including explanation of steps to avoid timeout exception.
 **/

/*
 * Complete the 'arrayManipulation' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. 2D_INTEGER_ARRAY queries
 */

fun arrayManipulation(n: Int, queries: Array<IntArray>): Long {
    var max = 0L
    var a: Int
    var b: Int
    var k: Int
    val arr = IntArray(n + 2)
    for (i in queries.indices) {
        a = queries[i][0]
        b = queries[i][1]
        k = queries[i][2]
        for (j in arr.indices) {
            if (j >= a) {
                arr[j] = arr[j] + k
            }
            if (j > b) {
                arr[j] = arr[j] - k
            }
        }
    }
    Arrays.sort(arr)
    max = arr[arr.size - 1].toLong()
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

/*
This solution returned a time out error when checking the code on the site
 */
//fun arrayManipulation(n: Int, queries: Array<Array<Int>>): Long {
//    // Write your code here
//    //create array of 0s of size n (https://stackoverflow.com/questions/31366229/how-to-initialize-an-array-in-kotlin-with-values)
//    val arr = IntArray(n) {0}
//    var currentVal = 0
//    var maxVal = 0
//    var i = 0
//
//    queries.forEach {
//        val startRange = it[0]+1
//        val endRange = it[1]+1
//        val value = it[2]
//
//        while (i < n) {
//            arr[startRange]+=value
//            arr[endRange]-=value
//            currentVal = arr.toList().max()!!
//        }
//
//        if (currentVal > maxVal) {
//            maxVal = currentVal
//        }
//    }
//
//    return maxVal.toLong()
//
//}
