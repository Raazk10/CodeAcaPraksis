
fun getListOfNumbers():List<Int> {
    var myList = mutableListOf<Int>()

    for ( x in 1..7) {
            println("Enter a number:")
            val num = readLine()!!.toInt()
            myList.add(num)
        }
        return myList
    }
fun findMax(myList: List<Int>):Int {
    var largestNumber = myList[0]
    for (i in myList){
        if (i > largestNumber ){
            largestNumber = i
        }

    }
    return largestNumber

}
fun findMin(myList: List<Int>):Int {
    var smallestNumber = myList[1]
    for (i in myList) {
        if (i < smallestNumber) {
            smallestNumber = i
        }

    }
    return  smallestNumber
}
fun findDiff(myList: List<Int>):Int {
    val values = getListOfNumbers()
    val largestValue = findMax(values)
    val smallestValue = findMin(values)
    return largestValue - smallestValue
}
fun findAverage(myList: List<Int>):Int {
    var sum = 0
    for (i in myList) {
        sum += i
    }
    return  sum / myList.size

}

fun checkIfListContains(myList: List<Int>, intArg:Int):Boolean {
    for ( i in myList) {
        if (i == intArg) {
            return true
        }
    }
        return false

}

fun main() {
  val values=  getListOfNumbers()
    println(values)
    val largestValue =findMax(values)
    println("The largest value is $largestValue")

    val smallestValue =findMin(values)
    val average = findAverage(values)
    println("The average is $average")

    println("Enter value to find:")
    val num = readLine()!!.toInt()
    val containsValue = checkIfListContains(values, num)
    if (containsValue) {
        println("The value does exist")
    }else {
        println("The value does not exist in a list")
    }

    println("The smallest value is $smallestValue")
    val small = findDiff(values)
    println("The diff between largest and smallest value is $small")




}
/*

// to run program in command
kotlinc FunctionDIY.kt -include-runtime -d FunctionDIY.jar
java -jar FunctionDIY.jar*/
