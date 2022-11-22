fun main() {
    val intArray: Array<Int> = arrayOf(6,9,24)
    println(problem1(intArray))

    val intList: List<Int> = listOf(6,9,24)
    println(problem1(intList))
}

// Given an integer array of size N, compute the sum of all even numbers in this array
fun problem1(intArray: Array<Int>) : Int {
    var sum = 0
    for(index in intArray) {
        if(index % 2 == 0)
            sum += index
    }
    return sum
}

fun problem1(intList: List<Int>) : Int {
    return intList.sumOf { if(it % 2 == 0) it else 0}
}