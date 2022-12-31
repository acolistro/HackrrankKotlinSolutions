package interview_preparation_kit.arrays

/** Left Rotation(Array) - Easy - Problem Solving(Basic)
 *
 * A left rotation operation on an array shifts each of the array's elements 1 unit to the left.
 * For example, if 2 left rotations are performed on array [1,2,3,4,5], then the array would become
 * [3,4,5,1,2,].
 * Note that the lowest index item moves to the highest index in a rotation.
 * This is called a circular array. Given an array 'a' of 'n' integers and a number 'd',
 * , perform 'd' left rotations on the array. Return the updated array to be printed as a
 * single line of space-separated integers.
 */

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'rotLeft' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER d
 */

fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
    // Write your code here

    // val ar = a
    // var arrayList = a.toList()

    // val indicesToRotate = -(d-1)

    // Collections.rotate(arrayList, indicesToRotate)

    // arrayList.toIntArray()

    // for (i in 0 until indicesToRotate) {
    //     rotatedArray[i].
    // }

    if (d > a.size || d == 0) return a
    return a.sliceArray(d..a.lastIndex) + a.sliceArray(0 until d)

}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val d = first_multiple_input[1].toInt()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = rotLeft(a, d)

    println(result.joinToString(" "))
}
