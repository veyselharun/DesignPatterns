

fun main(args: Array<String>) {

    val player1 = Player1()
    val player2 = Player2()

    // val player3 = Player3() // Error
    val player3 = Player3("Fatma")

    val player4 = Player4("Ahmet")
    println(player4.getName())
    player4.setName("Mehmet")
    println(player4.getName())

    val player5: Player5 = Player5("Ayse")
    println(player5.name)
    // player5.name = "Furkan" // Error
    // println(player5.name)

    val player6 = Player6("Furkan")
    println(player6.name)
    player6.name = "Elif"
    println(player6.name)

    val player7 = Player7("Ahmet", 10)

    val player8 = Player8("Ahmet")
    player8.score = -10
    // String interpolation
    println("Player name: ${player8.name} and player score: ${player8.score.toString()}")

    val player9 = Player9("Mukaddes")
    player9.score = 15
    println(player9.score)
    player9.score = -15
    println(player9.score)
    println(player9.name)

    val player10 = Player10()
    println(player10.rollDice())

    val player11 = Player11()
    println(player11.rollDice())

    val player12 = Player12("Ayse")

    val user = User("Mehmet", "1234")


}

class Player1 {

}

class Player2

