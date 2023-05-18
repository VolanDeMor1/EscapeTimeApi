package lol.asgard.escapetime.api.event.gamer

import lol.asgard.escapetime.api.`object`.game.Game
import lol.asgard.escapetime.api.`object`.gamer.Gamer
import org.bukkit.entity.Player

class GamerJoinGameEvent(val game: Game, gamer: Gamer, player: Player)
    : GamerCancellableEvent(gamer, player)