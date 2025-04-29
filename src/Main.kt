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

var totalscore1 = 0
var totalscore2 = 0

var score1 = 0
var score2 = 0



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
    println("It will go on until the five rounds are done then it will declare" )
    println("a winner with the most points and if the users both have the same amount ")
    println(" of points it will say a tie")
    println("+--------------------------------------------------------------------------------+")


    // getting player names
    val player1 = getString("enter your name player 1:")
    val player2 = getString("enter your name player 2:")
    println("welcome to the dice game  $player1 and $player2 ")

// getting a list
    val dice = mutableListOf<String>()

    dice.add(1.toString())
    dice.add(2.toString())
    dice.add(3.toString())
    dice.add(4.toString())
    dice.add(5.toString())
    dice.add(6.toString())
    println("the dice are $dice")


    for (round in 1..5) {
        println("\n+--- Round $round ---+")

        // Player 1's Turn
        score1 = rollDice(player1)
        totalscore1 += score1
        println("totalscore1: $totalscore1")
        // Player 2's Turn
        score2 = rollDice(player2)
        totalscore2 += score2
        println("totalscore2: $totalscore2")


    }
    when {
        totalscore1 > totalscore2 -> println("Congratulations $player1 you won the game with a total score of $totalscore1")
        totalscore2 > totalscore1 -> println("Congratulations $player2 you won the game with a total score of $totalscore2")
        else -> println("It's a tie the game ended with a total score of $totalscore1")
    }
}



fun getString(s: String): String {
    var userInput: String
    while (true) {
        val prompt = "$s "
        println(prompt)
        userInput = readln()
        if (userInput.isNotBlank())
            return userInput

    }


}


fun rollDice(playerName: String): Int {
    print("$playerName, Please type 'y' to roll: ")
    readln() // Wait for the user's input
    val roll = Random.nextInt(1, 7) // Generate a random number between 1 and 6
    println("$playerName rolled a $roll")
    return roll
}


