import kotlin.random.Random

/**
 * =====================================================================
 * Programming Project for NCEA Level 2, Standard 91896
 * ---------------------------------------------------------------------
 * Project Name:  dice game
 * Project Author: Liam Mutch
 * GitHub Repo:    https://github.com/waimea-ljmutch/-level-2-programming-assessment
 * ---------------------------------------------------------------------
 * Notes:
 * Games that allow players to 'roll' multiple dice to gain points / beat the other player based on the dice rolled...
 * =====================================================================
 */

var score1 = 0
var score2 = 0

var turn1 = 0
var turn2 = 0


fun main() {
    println(
        " ________  ___  ________  _______                \n" +
                "|\\   ___ \\|\\  \\|\\   ____\\|\\  ___ \\               \n" +
                "\\ \\  \\_|\\ \\ \\  \\ \\  \\___|\\ \\   __/|              \n" +
                " \\ \\  \\ \\\\ \\ \\  \\ \\  \\    \\ \\  \\_|/__            \n" +
                "  \\ \\  \\_\\\\ \\ \\  \\ \\  \\____\\ \\  \\_|\\ \\           \n" +
                "   \\ \\_______\\ \\__\\ \\_______\\ \\_______\\          \n" +
                "    \\|_______|\\|__|\\|_______|\\|_______|          \n" +
                "                                                 \n" +
                "                                                 \n" +
                "                                                 \n" +
                " ________  ________  _____ ______   _______      \n" +
                "|\\   ____\\|\\   __  \\|\\   _ \\  _   \\|\\  ___ \\     \n" +
                "\\ \\  \\___|\\ \\  \\|\\  \\ \\  \\\\\\__\\ \\  \\ \\   __/|    \n" +
                " \\ \\  \\  __\\ \\   __  \\ \\  \\\\|__| \\  \\ \\  \\_|/__  \n" +
                "  \\ \\  \\|\\  \\ \\  \\ \\  \\ \\  \\    \\ \\  \\ \\  \\_|\\ \\ \n" +
                "   \\ \\_______\\ \\__\\ \\__\\ \\__\\    \\ \\__\\ \\_______\\\n" +
                "    \\|_______|\\|__|\\|__|\\|__|     \\|__|\\|_______|"
    )
    println("+--------------------------------------------------------------------------------+")
    println("INSTRUCTIONS")
    println("so what you have to do is there is two players player 1 & player 2.")
    println("the first player would go and you would role the die to see what number")
    println("you get whatever number you get it would add to your points. ")
    println("It will go on until one person looses bye the die or the other person")
    println("gets the most points ")
    println("+--------------------------------------------------------------------------------+")


    // getting player names
    val player1 = getString("enter your name player 1:")
    val player2 = getString("enter your name player 2:")
    println("welcome to the dice game  $player1 and $player2! ")

// there will be 5 rounds
    for (round in 1..5) {
        println("+--- Round $round ---+")

        // Player 1's Turn
        turn1 == rollDice(player1)
        score1 += turn1 // Add the score of Player 1

        // Player 2's Turn
        turn2 == rollDice(player2)
        score2 += turn2 // Add the score of Player 2

        println("Total score after Round $round:")
        println("$player1's score: $score1")
        println("$player2's score: $score2")
        println("+------------------------+")
    }



// Final results
    println("Game over!")
    println("$player1's total score: $score1")
    println("$player2's total score: $score2")

    if (score1 > score2) {
        println("$player1 wins!")
    } else if (score2 > score1) {
        println("$player2 wins!")
    } else {
        println("It's a tie!")
    }
}

fun getString(S: String): String {
    var userInput: String
    while (true) {
        val prompt = "$S "
        println(prompt)
        userInput = readln()
        if (userInput.isNotBlank())
            return userInput

    }
}
// Function to roll a die and return the result
fun rollDice(playerName: String): Int {
    print("$playerName, Please type 'y' to roll: ")
    readln() // Wait for the user's input
    val roll = Random.nextInt(1, 7) // Generate a random number between 1 and 6
    println("$playerName rolled a $roll")
    return roll
}




