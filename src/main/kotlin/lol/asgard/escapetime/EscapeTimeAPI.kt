package lol.asgard.escapetime

import lol.asgard.escapetime.api.`object`.MapType
import lol.asgard.escapetime.api.`object`.game.Game
import lol.asgard.escapetime.api.`object`.gamer.Gamer
import org.bukkit.OfflinePlayer
import org.bukkit.entity.Player

interface EscapeTimeAPI {

    fun testApi()
    fun newGame(gamer: Gamer, type: MapType)
    fun quickStart(gamer: Gamer)
    fun join(gamer: Gamer, game: Game)
    fun gamerOf(player: Player): Gamer
    fun gamerOf(player: OfflinePlayer): Gamer

}