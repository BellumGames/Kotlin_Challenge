fun main() {
    val intArray: Array<Int> = arrayOf(6,9,24)
    println(problem1(intArray))

    val charArray: Array<Char> = arrayOf('a','b','c','e')
    println(problem2(charArray))
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

// Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.
// You will always get a valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
// The array will always contain letters in only one case.(Use the English alphabet with 26 letters!)
fun problem2(charArray: Array<Char>) : String{
    if(charArray.size < 2)
        return "Dude, your array is too short try something longer :)"
    var upperCaseOn = true
    if(charArray[0].code in 97..122)
        upperCaseOn = false
    else if(charArray[0].code in 65..90)
        upperCaseOn = true
    for(i in 1 until charArray.size) {
        val previous:Int = charArray[i - 1].code
        val current:Int = charArray[i].code
        if(current - previous != 1){
            if(upperCaseOn)
                if(previous > current)
                    return "Letter " + (previous + 1).toChar().toString() + " is missing!"
            if(!upperCaseOn)
                if(previous < current)
                    return "Letter " + (previous + 1).toChar().toString() + " is missing!"
            return "Different cases detected!"
        }
    }
    return "Not a single letter of the alphabet is missing in this array!"
}