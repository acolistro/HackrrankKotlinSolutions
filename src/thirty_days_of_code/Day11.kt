package thirty_days_of_code

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

fun main(args: Array<String>) {

    val arr = Array<Array<Int>>(6, { Array<Int>(6, { 0 }) })

    for (i in 0 until 6) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    //my code
    for (i in 0..5) {
        for (j in 0..5) {
            arr[i][j]
        }
    }
    var maxval = -9 * 6
    for (i in 0..3) {
        for (j in 0..3) {
            var sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
            sum += arr[i + 1][j + 1]
            sum += arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]
            if (sum > maxval) {
                maxval = sum
            }
        }
    }
    println(maxval)
}
