package thirty_days_of_code

internal open class Person     // Constructor
    (protected var firstName: String, protected var lastName: String, protected var idNumber: Int) {
    // Print person data
    fun printPerson() {
        println(
            """
                Name: $lastName, $firstName
                ID: $idNumber
                """.trimIndent()
        )
    }
}

internal class Student
/**
 * Class Constructor
 *
 * @param firstName - A string denoting the Person's first name.
 * @param lastName - A string denoting the Person's last name.
 * @param "id" - An integer denoting the Person's ID number.
 * @param scores - An array of integers denoting the Person's test scores.
 */(
    firstName: String,
    lastName: String, idNumber: Int, private val testScores: IntArray
) : Person(firstName, lastName, idNumber) {
    /**
     * Method Name: calculate
     * @return A character denoting the grade.
     */
    fun calculate(): Char {
        var average = 0
        for (i in testScores.indices) {
            average += testScores[i]
        }
        average = average / testScores.size
        return if (average >= 90) {
            'O'
        } else if (average >= 80) {
            'E'
        } else if (average >= 70) {
            'A'
        } else if (average >= 55) {
            'P'
        } else if (average >= 40) {
            'D'
        } else {
            'T'
        }
    }
}