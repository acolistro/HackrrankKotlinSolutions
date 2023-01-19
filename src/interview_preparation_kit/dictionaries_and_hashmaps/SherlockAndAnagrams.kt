package interview_preparation_kit.dictionaries_and_hashmaps

/**
 * Sherlock and Anagrams - Medium - Problem Solving (intermediate)
 */

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/**
 *Two strings are anagrams of each other if the letters of one string can be rearranged to form the other string.
 * Given a string, find the number of pairs of substrings of the string that are anagrams of each other.
 *
 * Complete the 'sherlockAndAnagrams' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING s as parameter.
 */

fun sherlockAndAnagrams(s: String): Int {
    // Write your code here
    val map = HashMap<String, Int>()
    var d: Int
    var i: Int
    var k = 0
    val length = s.length
    val n = length * (length + 1) / 2
    val sub = arrayOfNulls<String>(n)
    d = 0
    while (d < length) {
        i = d + 1
        while (i <= length) {
            sub[k++] = s.substring(d, i)
            i++
        }
        d++
    }
    val c = IntArray(26)
    var result = 0
    for (l in 0 until n) {
        for (m in 0..25) {
            c[m] = 0
        }
        val suba = sub[l]!!.toCharArray()
        for (ch in suba) {
            c[ch - 'a'] += 1
        }
        val temp = Arrays.toString(c)
        var x = map[temp]
        if (x != null) {
            result = result + x
            map[temp] = ++x
        } else {
            map[temp] = 1
        }
    }
    return result
}

fun main(args: Array<String>) {
    val q = readLine()!!.trim().toInt()

    for (qItr in 1..q) {
        val s = readLine()!!

        val result = sherlockAndAnagrams(s)

        println(result)
    }
}
