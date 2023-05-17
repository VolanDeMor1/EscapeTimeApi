package lol.asgard.escapetime.api.thread

import lol.asgard.escapetime.api.`object`.game.Game
import net.kyori.adventure.bossbar.BossBar
import org.bukkit.entity.Player
import org.bukkit.scheduler.BukkitTask

interface GameTask {
    val game: Game
    var task: BukkitTask?
    val withBar: HashSet<Player>
    val bar: BossBar

    fun cancel()
}
