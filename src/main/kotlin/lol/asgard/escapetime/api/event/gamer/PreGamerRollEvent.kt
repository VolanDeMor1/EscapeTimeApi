package lol.asgard.escapetime.api.event.gamer

import lol.asgard.escapetime.api.`object`.gamer.Gamer
import org.bukkit.entity.Player

class PreGamerRollEvent(gamer: Gamer, player: Player) : GamerCancellableEvent(gamer, player)