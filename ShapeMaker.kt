fun main() {
    // Square Variables
    val sqSide = 7
    val sqChar1 = "+  "
    val sqChar2 = "#  "
    // Write your code below
//steps to create square
for (outerLoop in 1..sqSide) {   //step 2
    for (innerLoop in 1..sqSide) {
       // print(sqChar1)
   // println()
        if ((outerLoop % 2 == 0 && innerLoop % 2 == 0) || (outerLoop % 2 == 1 && innerLoop % 2 == 1)) {
            print(sqChar1)

        } else {
            print(sqChar2)
           // println()

        }

    }
    println()
}


    // Triangle Variables

    val triRows = 10
    var triCount = 0
    var triRowLen = triRows
    val triChar1 = "*  "
    val triChar2 = "   "
    // Write your code below
    for (outerLoops in triRows downTo 1) {

        while (triCount < triRowLen) {
            triCount++
            print(triChar1)
        }
        //
        println()
        triCount = 0
        triRowLen--
    }
triRowLen = triRows
    for (outerLoops in triRows downTo 1) {

        while (triCount < triRowLen) {
            triCount++
            if (triCount != 1 && triCount != triRowLen && outerLoops != triRows) {
                print(triChar2)
            } else {
                print(triChar1)
            }
        }
        println()
        triCount = 0
        triRowLen--
    }
}



