import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    val numletters = "Mississippi".count({ letter -> letter == 's' })

    println(numletters)


//    5.1  Defining an anonymous greeting function.

    println({
        val currenYear = 2018
        "Welcome to SimVillage , Mayor ! (copyright $currenYear)"
    })

//   5.2  Assigning the anonymous function to a variable.

    val greetingFunction1: () -> String = {
        val currentYear = 2018
        "Welcome to SimVillage , Mayor ! (copyright $currentYear)"
    }

    println(greetingFunction1())

//    5.3  Adding a playerName parameter to the anonymous function

    val greetingFunction2: (String) -> String = { playerName ->
        val currentyear = 2018
        "Welcome to SimVilllage , $playerName ! (copyright $currentyear"
    }

    println(greetingFunction2("Guyal"))


//    5.4  Using the it keyword

    val greetingFunction3: (String) -> String = {
        val currentYear = 2018
        "Welcome to SimVillage , it! (copyright $currentYear"
    }
    println(greetingFunction3("Guyal"))


//   5.5 Accepting a second argument
    val greettingFunction4 : (String, Int) -> String = { playName ,numBuildings ->
        val currentYear = 2018

        println("Adding $numBuildings houses")

        "Welcome to SimVillage , $playName ! (copyright $currentYear)"


    }

    println(greettingFunction4 ("Guyal" , 2))


//     5.6  Using type inference for greetingFunction

      val greetingFunction5 = { playName : String ,numBuildings : Int ->
          val currentYear = 2018
          println("Adding $numBuildings houses")
          "Welcome to SimVillage , $playName ! (copyright $currentYear)"

      }
      println(greetingFunction5("Guyal",2))


}

//    5.7  Adding the runSimulation function

fun runSimulation (playerName : String ,greetingFunction :(String,Int) -> String) {

    val numBuildings = Random.nextInt(1..3)
    println(greetingFunction(playerName, numBuildings))
}


//5.9  Using the inline keyword

   inline fun runSimulation1(
    playerName: String,
    greetingFunction: (String, Int) -> String ){
    val numBuildings = Random.nextInt(1..3) // Randomly selects 1, 2, or 3
    println(greetingFunction(playerName, numBuildings)) }


//5.10  Defining the printConstructionCost function

inline fun runSimulation2(
    playerName: String,
    greetingFunction: (String, Int) -> String) {
    val numBuildings = Random.nextInt(1..3) // Randomly selects 1, 2, or 3
    println(greetingFunction(playerName, numBuildings)) }
fun printConstructionCost(numBuildings: Int) {
    val cost = 500
    println("construction cost: ${cost * numBuildings}") }


// 5.11  Adding a costPrinter parameter

inline fun runSimulation(
    playerName: String,
    costPrinter: (Int) -> Unit,
    greetingFunction: (String, Int) -> String
) {
    val numBuildings = Random.nextInt(1..3) // Randomly selects 1, 2, or 3
    costPrinter(numBuildings)
    println(greetingFunction(playerName, numBuildings))
}
fun printConstructionCost1(numBuildings: Int) {
    val cost = 500
    println("construction cost: ${cost * numBuildings}")}













