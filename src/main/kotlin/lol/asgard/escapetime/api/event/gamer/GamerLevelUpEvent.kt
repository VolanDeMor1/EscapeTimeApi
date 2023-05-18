package lol.asgard.escapetime.api.event.gamer

import lol.asgard.escapetime.api.`object`.gamer.Gamer
import org.bukkit.entity.Player

class GamerLevelUpEvent(gamer: Gamer, player: Player) : GamerEvent(gamer, player)