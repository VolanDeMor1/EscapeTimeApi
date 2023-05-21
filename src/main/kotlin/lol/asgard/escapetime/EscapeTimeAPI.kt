package lol.asgard.escapetime

import lol.asgard.escapetime.api.`object`.MapType
import lol.asgard.escapetime.api.`object`.game.Game
import lol.asgard.escapetime.api.`object`.gamer.Gamer
import org.bukkit.Bukkit
import org.bukkit.OfflinePlayer
import org.bukkit.entity.Player
import org.bukkit.plugin.Plugin

interface EscapeTimeAPI {

    fun testApi()
    fun newGame(gamer: Gamer, type: MapType)
    fun quickStart(gamer: Gamer)
    fun join(gamer: Gamer, game: Game)
    fun gamerOf(player: Player): Gamer
    fun gamerOf(player: OfflinePlayer): Gamer?

    companion object {
        @JvmStatic
        fun get(): EscapeTimeAPI {
            val pl: Plugin? = Bukkit.getPluginManager().getPlugin("EscapeTime")
            if (pl != null) return (pl as EscapeTime).api()
            else throw NullPointerException("Плагин EscapeTime не обнаружен (см. подробнее https://github.com/VolanDeMor1/EscapeTimeApi#errors)")
        }
    }

}