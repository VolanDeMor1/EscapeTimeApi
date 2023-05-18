package lol.asgard.escapetime.api.event.gamer

import lol.asgard.escapetime.api.`object`.gamer.Gamer
import org.bukkit.entity.Player
import org.bukkit.event.Cancellable
import org.bukkit.event.HandlerList

abstract class GamerCancellableEvent(gamer: Gamer, player: Player): GamerEvent(gamer, player), Cancellable {

    private var cancelled: Boolean = false

    companion object {
        @JvmStatic
        private val h: HandlerList = HandlerList()
        @JvmStatic
        fun getHandlerList(): HandlerList = h
    }

    override fun getHandlers(): HandlerList = h

    override fun isCancelled(): Boolean = cancelled

    override fun setCancelled(cancel: Boolean) {
        cancelled = cancel
    }

}