package interview_preparation_kit.dictionaries_and_hashmaps

/** Two Strings - Easy - Dictionaries and Hashmaps - Problem Solving (basic) */

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/**
 * Given two strings, determine if they share a common substring.
 * A substring may be as small as one character.
 *
 * Complete the 'twoStrings' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. STRING s1
 *  2. STRING s2
 *
 *  resource: https://www.blogoncode.com/2021/11/two-strings-hackerrank-solution-in-java.html
 */

fun twoStrings(s1: String, s2: String): String {
    // Write your code here

    var containsSubstring = false
    val map: MutableMap<Char, Int?> = HashMap()
    for (i in 0 until s1.length) {
        map[s1[i]] = i
    }
    for (j in 0 until s2.length) {
        if (map.containsKey(s2[j])) {
            containsSubstring = true
            break
        }
    }
    return if (containsSubstring) "YES" else "NO"
}

fun main(args: Array<String>) {
    val q = readLine()!!.trim().toInt()

    for (qItr in 1..q) {
        val s1 = readLine()!!

        val s2 = readLine()!!

        val result = twoStrings(s1, s2)

        println(result)
    }
}
