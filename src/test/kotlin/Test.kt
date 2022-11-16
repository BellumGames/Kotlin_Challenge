import org.junit.jupiter.api.Assertions
import java.util.*

class Test {
    @org.junit.jupiter.api.Test
    internal fun testProblem1_Testcase_EvenNumberWillGetSumOnly() {
        val intArray: Array<Int> = arrayOf(6,9,24)
        val expected = 30
        Assertions.assertEquals(expected, problem1(intArray))
    }

    @org.junit.jupiter.api.Test
    internal fun testProblem1_Testcase_OddNumbersOnlyShouldGive0() {
        val intArray: Array<Int>  = arrayOf(9,1)
        val expected = 0
        Assertions.assertEquals(expected, problem1(intArray))
    }

    //---------------------------------------------------------------------------------------------------------------

    @org.junit.jupiter.api.Test
    internal fun testProblem2_Testcase_TooShortArray() {
        val charArray: Array<Char> = arrayOf('a')
        val expected = "Dude, your array is too short try something longer :)"
        Assertions.assertEquals(expected,problem2(charArray))
    }

    @org.junit.jupiter.api.Test
    internal fun testProblem2_Testcase_DWillHaveToBeMissing() {
        val charArray: Array<Char> = arrayOf('a','b','c','e')
        val expected = "Letter d is missing!"
        Assertions.assertEquals(expected,problem2(charArray))
    }

    @org.junit.jupiter.api.Test
    internal fun testProblem2_Testcase_DifferentCasePattern_Upper() {
        val charArray: Array<Char> = arrayOf('A','b','C','D')
        val expected = "Different cases detected!"
        Assertions.assertEquals(expected,problem2(charArray))
    }

    @org.junit.jupiter.api.Test
    internal fun testProblem2_Testcase_DifferentCasePattern_Lower() {
        val charArray: Array<Char> = arrayOf('a','B','c','d')
        val expected = "Different cases detected!"
        Assertions.assertEquals(expected,problem2(charArray))
    }

    @org.junit.jupiter.api.Test
    internal fun testProblem2_Testcase_NoLetterMissing_Upper() {
        val charArray: Array<Char> = arrayOf('A','B','C','D')
        val expected = "Not a single letter of the alphabet is missing in this array!"
        Assertions.assertEquals(expected,problem2(charArray))
    }

    @org.junit.jupiter.api.Test
    internal fun testProblem2_Testcase_NoLetterMissing_Lower() {
        val charArray: Array<Char> = arrayOf('a','b','c','d')
        val expected = "Not a single letter of the alphabet is missing in this array!"
        Assertions.assertEquals(expected,problem2(charArray))
    }

    @org.junit.jupiter.api.Test
    internal fun testProblem2_Testcase_WeDon_tStartAtA_NoLetterMissing() {
        val charArray: Array<Char> = arrayOf('b','c','d','e')
        val expected = "Not a single letter of the alphabet is missing in this array!"
        Assertions.assertEquals(expected,problem2(charArray))
    }

    @org.junit.jupiter.api.Test
    internal fun testProblem2_Testcase_WeDon_tStartAtA_LetterMissing() {
        val charArray: Array<Char> = arrayOf('b','c','d','f')
        val expected = "Letter e is missing!"
        Assertions.assertEquals(expected,problem2(charArray))
    }

    //---------------------------------------------------------------------------------------------------------------

    @org.junit.jupiter.api.Test
    internal fun testProblem3_Testcase_DefaultTest() {
        val jenny: LinkedList<Char> = LinkedList<Char>()
        jenny.add('A')
        jenny.add('C')
        jenny.add('A')

        val stephanie: LinkedList<Char> = LinkedList<Char>()
        stephanie.add('B')
        stephanie.add('C')
        stephanie.add('F')

        val expected: LinkedList<Char> = LinkedList<Char>()
        expected.add('A')
        expected.add('B')
        expected.add('C')
        expected.add('A')
        expected.add('C')
        expected.add('F')
        val rachel: LinkedList<Char> = problem3(jenny,stephanie)
        Assertions.assertEquals(expected,rachel)
    }
}