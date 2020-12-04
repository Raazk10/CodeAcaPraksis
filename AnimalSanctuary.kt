fun main() {
    val responsibilities = listOf("feed the chimps", "play a random game", "conduct a health check on Foxie")


    val activities = responsibilities.size
    var responsibilitiesComplete = 0
    var timeSpent = 0
    val totalShiftTime = 4

    var foxiesHealthCheck = mutableMapOf<String, Any?>()
    var chimpsHaveEaten = mutableMapOf("Bonnie" to false, "Jubilee" to false, "Frodo" to false, "Foxie" to false)

    println("First, ${responsibilities[0]}")
    println(".....**************......")
    println("Feeding Bonnie....")
    chimpsHaveEaten["Bonnie"] = true

    println("Feeding Jubilee....")
    chimpsHaveEaten["Jubilee"] = true

    println("Feeding Frodo....")
    chimpsHaveEaten["Frodo"] = true

    println("Feeding Foxie....")
    chimpsHaveEaten["Foxie"] = true

    timeSpent += 1
    responsibilitiesComplete += 1
    println("All chimps have now been fed! You've completed  $responsibilitiesComplete / $activities  responsibilities.")

    //Playing a Random Game
    println(".......................")
    println("Next, ${responsibilities[1]}")
    println(".....**************......")

    val games = setOf("tug-of-war with a blanket", "catch and throw", "number game")
    val randomGame = games.random()
    println(randomGame)
    timeSpent += 1
    responsibilitiesComplete += 1
    println("Each chimp has now played a game of $randomGame.You've completed  $responsibilitiesComplete / $activities  responsibilities.")

    println(".......................")
    println("Next, ${responsibilities[2]}")
    println(".....**************......")

    foxiesHealthCheck.put("temperature",32.7)
    foxiesHealthCheck.put("mood","happy")
    println("Foxie has a temperature of ${foxiesHealthCheck["temperature"]} and is feeling ${foxiesHealthCheck["mood"]} ")
/*
    if (foxiesHealthCheck["temperature"] > 32.7 ) {
        println("Foxie has a temperature of ${foxiesHealthCheck["temperature"]} and is feeling ${foxiesHealthCheck["mood"]} ")

    }else
        println("Call the Vet soon")
*/

    timeSpent +=1
    responsibilitiesComplete += 1
    println("You've now completed $responsibilitiesComplete / $activities responsibilities.")

    println(".......................")

    if (timeSpent <= totalShiftTime && responsibilitiesComplete == activities) {
        println("Congratulation for completing all responsibilites in time.")
    }else if (timeSpent >=totalShiftTime && responsibilitiesComplete == activities){
        println("all responsibilites were complete but overtime.")
    }else {
        println("all of the responsibilities were not complete and took extra time.")
    }





}