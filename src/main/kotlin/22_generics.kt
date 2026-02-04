/*
Generics let you write classes and functions that work with different types,
while still being type-safe.

Type-safe means:
- The compiler checks types at compile time
- You avoid runtime errors caused by wrong object types
*/

fun main() {

    // Creating players of different sports
    val footballPlayer1 = FootballPlayer1("Football Player 1")
    val footballPlayer2 = FootballPlayer1("Football Player 2")

    val baseballPlayer1 = BaseballPlayer("Baseball Player 1")
    val baseballPlayer2 = BaseballPlayer("Baseball Player 2")

    // Team<FootballPlayer1>
    // T is replaced by FootballPlayer1 here
    val footballTeam = Team(
        "Football Team",
        mutableListOf(footballPlayer1)
    )
    footballTeam.addPlayer(footballPlayer2)

    // Team<BaseballPlayer>
    val baseballTeam = Team(
        "Baseball Team",
        mutableListOf(baseballPlayer1)
    )
    baseballTeam.addPlayer(baseballPlayer2)

    /*
    This works because FootballPlayer1 extends Player,
    and we explicitly say Team<Player>
    */
    val mixedFootballTeam = Team<Player>(
        "Another Football Team",
        mutableListOf(
            FootballPlayer1("Player 1"),
            FootballPlayer1("Player 2")
        )
    )

    /*
    This will NOT compile:
    GamesPlayer does not inherit from Player
    */
//    val gameTeam = Team<GamesPlayer>("Game Team", mutableListOf())
}

/*
Generic class Team<T>

T is a placeholder for a type.
The constraint `T : Player` means:
- T must be Player or a subclass of Player
- This allows us to safely access Player properties like `name`
*/
class Team<T : Player>(
    val name: String,
    val players: MutableList<T>
) {

    fun addPlayer(player: T) {

        // contains() checks if the exact object already exists
        if (players.contains(player)) {
            println("Player: ${player.name} is already in the team $name.")
        } else {
            players.add(player)
            println("Player: ${player.name} was added to the team $name.")
        }
    }
}

/*
Base class for all players
*/
open class Player(val name: String)

/*
Specific player types
They inherit from Player
*/
class FootballPlayer1(name: String) : Player(name)
class BaseballPlayer(name: String) : Player(name)

/*
This class does NOT inherit from Player
So it cannot be used with Team<T : Player>
*/
class GamesPlayer(name: String)
