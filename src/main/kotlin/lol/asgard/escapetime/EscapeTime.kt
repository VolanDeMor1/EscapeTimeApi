package lol.asgard.escapetime

import lol.asgard.escapetime.api.`object`.MapType
import lol.asgard.escapetime.api.`object`.game.Game
import lol.asgard.escapetime.api.`object`.gamer.Gamer
import org.bukkit.OfflinePlayer
import org.bukkit.entity.Player
import org.jetbrains.annotations.ApiStatus.Experimental

interface EscapeTime {

    companion object {
        @JvmStatic
        @get:Experimental
        val api: EscapeTimeAPI? = null
        @JvmStatic
        @Experimental
        fun testApi() = api!!.testApi()
        @JvmStatic
        @Experimental
        fun newGame(gamer: Gamer, type: MapType) = api!!.newGame(gamer, type)
        @JvmStatic
        @Experimental
        fun quickStart(gamer: Gamer) = api!!.quickStart(gamer)
        @JvmStatic
        @Experimental
        fun join(gamer: Gamer, game: Game) = api!!.join(gamer, game)
        @JvmStatic
        @Experimental
        fun gamerOf(player: Player): Gamer = api!!.gamerOf(player)
        @JvmStatic
        @Experimental
        fun gamerOf(player: OfflinePlayer): Gamer? = api!!.gamerOf(player)
    }

    fun api(): EscapeTimeAPI

}