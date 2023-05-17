package lol.asgard.escapetime

import lol.asgard.escapetime.`object`.MapType
import lol.asgard.escapetime.`object`.game.Game
import lol.asgard.escapetime.`object`.gamer.Gamer

interface EscapeTimeAPI {

    fun testApi()
    fun newGame(gamer: Gamer, type: MapType)
    fun quickStart(gamer: Gamer)
    fun join(gamer: Gamer, game: Game)

}