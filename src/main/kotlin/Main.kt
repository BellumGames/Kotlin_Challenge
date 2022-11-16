fun main() {
    val intArray: Array<Int> = arrayOf(6,9,24)
    println(problem1(intArray))
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