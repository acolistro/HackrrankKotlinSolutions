package thirty_days_of_code

import java.util.*
import kotlin.jvm.JvmStatic

internal object Solution {
    @JvmStatic
    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)
        val n = scan.nextInt()
        scan.close()
        val binary = Integer.toBinaryString(n).toCharArray()
        var tmpCount = 0
        var maxCount = 0
        for (i in binary.indices) {
            tmpCount = if (binary[i] == '0') 0 else tmpCount + 1
            if (tmpCount > maxCount) {
                maxCount = tmpCount
            }
        }
        println(maxCount)
    }
}