import javax.print.attribute.standard.RequestingUserName


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
    println("welcome to the dice game  $player1 and $player2 ")

// getting a list
    val dice = mutableListOf<String>()

    dice.add(1.toString())
    dice.add(2.toString())
    dice.add(3.toString())
    dice.add(4.toString())
    dice.add(5.toString())
    dice.add(6.toString())
    dice.add(7.toString())
    dice.add(8.toString())
    dice.add(9.toString())
    dice.add(10.toString())
    println(dice)


    var score1 = 0
    var score2 = 0


    for (round in 1..8) {
        println("\n+--- Round $round ---+")

        // Player 1's Turn
        score1 += rollDice(player1)

        // Player 2's Turn
        score2 += rollDice(player2)

        var player1Points = 0
        var player2Points = 0

        //main game loop
        var currentPlayer = 1
        var roundpoints = 0

        fun rollDice(userName: String): Int {
            print("$userName, Please type 'r' to roll ")
            readln() // Wait for the users input
            val roll = rollDice().random().toInt() // Get a random number between 1 - 10
            println("$userName rolled a $roll")
            return roll
        }


    fun getString(prompt: String): String {
        var userInput: String

        while (true) {
            print(prompt)

            userInput = readln()
            if (userInput.isNotBlank()) break
        }

        return userInput
    }
}

    // Function to simulate a dice roll
    fun rollDice(): Int {
        
    }




