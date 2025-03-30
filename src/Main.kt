

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
    println("Enter your name player 1: ")
    val player1 = readln()
    println("player1:  ${player1} ")


    println("Enter you name player 2: ")
    val player2 = readln()
    println("player2: ${player2} ")

    println("welcome to the dice game  ${player1} and ${player2} ")
    println()

    println("do you wish to play yes/no")



    if (player1 == "z" && player2 == "z") {

    }


    val dice= mutableListOf<String>()

    dice.add(1.toString())
    dice.add(2.toString())
    dice.add(3.toString())
    dice.add(4.toString())
    dice.add(5.toString())
    dice.add(6.toString())
    println(dice)




    fun getString(prompt: String): String {
        var userInput: String

        while(true) {
            print(prompt)

            userInput = readln()
            if (userInput.isNotBlank()) break
        }

        return userInput
    }


}