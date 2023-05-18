package lol.asgard.escapetime.api.event.game

import lol.asgard.escapetime.api.`object`.game.Game
import org.bukkit.event.Event
import org.bukkit.event.HandlerList

abstract class GameEvent(val game: Game): Event() {

    companion object {
        @JvmStatic
        private val h: HandlerList = HandlerList()
        @JvmStatic
        fun getHandlerList(): HandlerList = h
    }

    override fun getHandlers(): HandlerList = h

}