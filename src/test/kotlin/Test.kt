import org.junit.jupiter.api.Assertions

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
    @org.junit.jupiter.api.Test
    internal fun testProblem1_Testcase_EvenNumberWillGetSumOnly_ListImplementation() {
        val intArray: List<Int> = listOf(6,9,24)
        val expected = 30
        Assertions.assertEquals(expected, problem1(intArray))
    }

    @org.junit.jupiter.api.Test
    internal fun testProblem1_Testcase_OddNumbersOnlyShouldGive0_ListImplementation() {
        val intArray: List<Int>  = listOf(9,1)
        val expected = 0
        Assertions.assertEquals(expected, problem1(intArray))
    }

    //---------------------------------------------------------------------------------------------------------------
}