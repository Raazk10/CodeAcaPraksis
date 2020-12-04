fun main() {
    val quizAnswer1 = 15
    var quizAnswer2 = 3
    val quizAnswer3 = "isosceles"
    val quizAnswer4 = 47

// create question
    println("What is 75 / 5 ? :")
    val studentAnswer1 = readLine()!!.toInt()
    println("What is value of y in equation 6 * 2y = 36 ?")
    val studentAnswer2 = readLine()!!.toInt()
    println("Name the triangle that has two equal sides?")
    val studentAnswer3 = readLine()!!

    println(" What is value of 8 * 6 - (3 - 2)?")
    val studentAnswer4 = readLine()!!.toInt()

    //grading the quiz

    var points = 0

    if (studentAnswer1 == quizAnswer1) {
        points += 25
    }

     if (studentAnswer2 == quizAnswer2) {
         points += 25
     }else if (studentAnswer2== quizAnswer2++ || studentAnswer2==quizAnswer2--) {
         points += 20
         println("The answer $studentAnswer2 is within 1 point of $quizAnswer2.")
     }else  {
         points++
     }

     if (studentAnswer3==quizAnswer3) {
        points += 25

    }else if (studentAnswer3=="equilateral") {
         points += 10
     }else {
         points++
     }

    if (studentAnswer4 == quizAnswer4) {
        points += 25

    } else if (studentAnswer4 in 44..54) {
        points += 20
    }else {
        points++

    }
when(points) {
    in 0..59 -> println("Student received an F")
    in 60..69 ->println("Student received an D")
    in 70..79 ->println("Student received an C")
    in 80..89 ->println("Student received an B")
    in 90..100 ->println("Student received an A")
    else ->println("Student received an A+")

}


}