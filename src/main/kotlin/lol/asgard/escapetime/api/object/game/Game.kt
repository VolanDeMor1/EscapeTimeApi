package lol.asgard.escapetime.api.`object`.game

import lol.asgard.escapetime.api.`object`.Map
import lol.asgard.escapetime.api.`object`.ToyType
import lol.asgard.escapetime.api.`object`.gamer.Gamer
import lol.asgard.escapetime.api.thread.GameTask
import org.bukkit.scheduler.BukkitTask

interface Game {
    val toyType: ToyType
    val requiredParts: List<Int>
    val owner: Gamer
    val gamers: List<Gamer>
    val map: Map
    val task: GameTask
    var monsterTimer: BukkitTask?
    var alive: List<Gamer>?
    var monster: Gamer?
    var endIn: Long
}