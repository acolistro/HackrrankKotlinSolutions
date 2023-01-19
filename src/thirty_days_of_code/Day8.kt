package thirty_days_of_code.Day8

import java.util.*

/**
 * Given 'n' names and phone numbers, assemble a phone book that maps friends'
 * names to their respective phone numbers.
 * You will then be given an unknown number of names to query your phone book for.
 * For each 'name' queried, print the associated entry from your phone book on a new line
 * in the form name=phoneNumber;
 * if an entry for 'name' is not found, print Not found instead.
 *
 * I used the provided tutorial (Java) and translated it to Kotlin.
 */

//Complete this code or write your own from scratch

fun main(argh: Array<String>) {
    val `in` = Scanner(System.`in`)
    val n = `in`.nextInt()
    //Create phone book hashmap
    val phoneBook: MutableMap<String, Int?> = HashMap()
    for (i in 0 until n) {
        val name = `in`.next()
        val phone = `in`.nextInt()
        // Write code here
        //add keys and values to phone book
        phoneBook[name] = phone
    }
    while (`in`.hasNext()) {
        val s = `in`.next()
        // Write code here
        //print key + value OR Not found
        if (phoneBook.containsKey(s)) {
            println(s.toString() + "=" + phoneBook[s].toString())
        } else {
            println("Not found")
        }
    }
    `in`.close()
}
