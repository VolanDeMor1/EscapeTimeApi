package lol.asgard.escapetime.api.event.gamer

import lol.asgard.escapetime.api.`object`.gamer.Gamer
import org.bukkit.entity.Player
import org.bukkit.event.HandlerList
import org.bukkit.event.player.PlayerEvent

abstract class GamerEvent(var gamer: Gamer, player: Player): PlayerEvent(player) {

    companion object {
        @JvmStatic
        private val h: HandlerList = HandlerList()
        @JvmStatic
        fun getHandlerList(): HandlerList = h
    }

    override fun getHandlers(): HandlerList = h

}