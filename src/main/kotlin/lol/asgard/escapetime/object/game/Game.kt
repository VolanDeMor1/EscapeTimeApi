package lol.asgard.escapetime.`object`.game

import lol.asgard.escapetime.`object`.Map
import lol.asgard.escapetime.`object`.ToyType
import lol.asgard.escapetime.`object`.gamer.Gamer
import lol.asgard.escapetime.thread.GameTask
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