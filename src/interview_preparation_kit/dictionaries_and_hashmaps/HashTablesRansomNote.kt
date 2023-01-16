package interview_preparation_kit.dictionaries_and_hashmaps

/** Hash Table: Ransom Note - Easy - Dictionaries and Hashmaps - Problem Solving (intermediate) */

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/**
 * Given the words in the magazine and the words in the ransom note,
 * print Yes if he can replicate his ransom note exactly using whole words
 * from the magazine; otherwise, print No.
 *
 * Complete the 'checkMagazine' function below.
 *
 * The function accepts following parameters:
 *  1. STRING_ARRAY magazine
 *  2. STRING_ARRAY note
 *
 *  resources: https://levelup.gitconnected.com/ransom-note-challenge-in-kotlin-bfe334fe2e15
 *  https://www.typeerror.org/docs/kotlin~1.6/api/latest/jvm/stdlib/kotlin/get-or-default
 */

fun checkMagazine(magazine: Array<String>, note: Array<String>): Unit {
    // Write your code here
    val countMap = mutableMapOf<String, Int>()
    var includes = ""

    for (w in magazine) {
        countMap[w] = countMap.getOrDefault(w, 0) + 1
    }

    for (r in note) {
        if (!countMap.containsKey(r) || countMap[r]!! <= 0) {
            includes = "No"
        }
        countMap[r] = countMap.getOrDefault(r, 0) - 1
    }

    if (includes != "No") {
        includes = "Yes"
    }

    println(includes)
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val m = first_multiple_input[0].toInt()

    val n = first_multiple_input[1].toInt()

    val magazine = readLine()!!.trimEnd().split(" ").toTypedArray()

    val note = readLine()!!.trimEnd().split(" ").toTypedArray()

    checkMagazine(magazine, note)
}
