package lol.asgard.escapetime.api.event.gamer

import lol.asgard.escapetime.api.`object`.game.Game
import lol.asgard.escapetime.api.`object`.gamer.Gamer
import org.bukkit.entity.Player

class GamerQuitGameEvent(val game: Game, val force: Boolean, gamer: Gamer, player: Player)
    : GamerEvent(gamer, player)