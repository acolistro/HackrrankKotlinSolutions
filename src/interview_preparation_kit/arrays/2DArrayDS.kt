package interview_preparation_kit.arrays

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/** 2D Array - Easy - Problem Solving (basic) **/
/** https://www.hackerrank.com/challenges/2d-array/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays **/

/**
 * Complete the 'hourglassSum' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun hourglassSum(arr: Array<Array<Int>>): Int {
    // Write your code here
    var maxSum = Int.MIN_VALUE
    var sum = 0
    for (i in 0..5) {
        for (j in 0..5) {
            if (i > 1 && j > 1) {
                sum = (arr[i][j] + arr[i][j - 1] + arr[i][j - 2]
                        + arr[i - 1][j - 1]
                        + arr[i - 2][j] + arr[i - 2][j - 1] + arr[i - 2][j - 2])
                if (sum > maxSum) {
                    maxSum = sum
                }
            }
        }
    }
    return maxSum
}

fun main(args: Array<String>) {

    val arr = Array<Array<Int>>(6, { Array<Int>(6, { 0 }) })

    for (i in 0 until 6) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = hourglassSum(arr)

    println(result)
}
