import java.util.*

fun main() {
    val intArray: Array<Int> = arrayOf(6,9,24)
    println(problem1(intArray))

    val charArray: Array<Char> = arrayOf('a','b','c','e')
    println(problem2(charArray))

    val jenny: LinkedList<Char> = LinkedList<Char>()
    jenny.add('A')
    jenny.add('C')
    jenny.add('A')

    val stephanie: LinkedList<Char> = LinkedList<Char>()
    stephanie.add('B')
    stephanie.add('C')
    stephanie.add('F')

    val rachel: LinkedList<Char> = problem3(jenny,stephanie)
    for((i, index) in rachel.withIndex()){
        println("$index <-> $i")
    }
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

// Jenny and Stephanie are friends. Both of them like letters, especially uppercase ones.
// They are cutting uppercase letters from newspapers, and each one of them has his collection of letters stored in a stack.
// One sunny day, Rachel visited Jenny and Stephanie. She saw their collections. She wondered what is the lexicographically minimal string made of those two collections. She can take a letter from a collection only when it is on the top of the stack. Rachel wants to use all the letters in their collections.
// As an example, assume Jenny has collected a = [A, C, A] and Stephanie has b = [B, C, F]. The example shows the top at index 0 for each stack of letters. Assemble the string as follows:
fun problem3(jenny: LinkedList<Char>, stephanie: LinkedList<Char>) : LinkedList<Char>{
    val rachel: LinkedList<Char> = LinkedList<Char>()
    while(!jenny.isEmpty() || !stephanie.isEmpty()){
        if(!jenny.isEmpty() && !stephanie.isEmpty()){//if jenny and stephanie are not empty
            if(jenny[0].code <= stephanie[0].code) {
                rachel.add(jenny.pop())
            } else if (stephanie[0].code <= jenny[0].code) {
                rachel.add(stephanie.pop())
            }
        } else if(!jenny.isEmpty() && stephanie.isEmpty()){ //if jenny isn't empty but stephanie is
            rachel.add(jenny.pop())
        } else if(jenny.isEmpty() && !stephanie.isEmpty()){ //if stephanie isn't empty but jenny is
            rachel.add(stephanie.pop())
        }
    }
    return rachel
}
//Done...