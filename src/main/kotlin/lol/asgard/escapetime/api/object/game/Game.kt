package lol.asgard.escapetime.api.`object`.game

import lol.asgard.escapetime.api.`object`.Map
import lol.asgard.escapetime.api.`object`.ToyType
import lol.asgard.escapetime.api.`object`.gamer.Gamer
import lol.asgard.escapetime.api.thread.GameTask
import org.bukkit.scheduler.BukkitTask
import org.jetbrains.annotations.NotNull

interface Game {
    val toyType: ToyType
    val requiredParts: List<Int>
    val owner: Gamer
    val gamers: List<Gamer>
    val map: Map
    val task: GameTask
    val alive: List<Gamer>
    var monsterTimer: BukkitTask?
    var monster: Gamer?
    var endIn: Long?

    fun join(gamer: Gamer)
    fun leave(gamer: Gamer, force: Boolean)
    fun leave(gamer: Gamer)
    fun startCounter()
    fun spawnMonster(gamer: Gamer)
    fun start()
    fun end(reason: EndReason)
    fun collectPart(part: Int)
    fun remove()
    fun getState(): GameState
    fun setState(state: GameState)
    fun getTimeToEnd(): String
}