package lol.asgard.escapetime.api.thread

import lol.asgard.escapetime.api.`object`.game.Game
import net.kyori.adventure.bossbar.BossBar
import org.bukkit.entity.Player
import org.bukkit.scheduler.BukkitTask

abstract class GameTask(game: Game) : Thread("Game Task") {
    abstract val game: Game
    abstract var task: BukkitTask?
    abstract val withBar: HashSet<Player>
    abstract val bar: BossBar

    abstract fun cancel()
}
