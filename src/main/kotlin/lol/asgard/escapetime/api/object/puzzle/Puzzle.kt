package lol.asgard.escapetime.api.`object`.puzzle

import lol.asgard.escapetime.api.`object`.Pillar
import lol.asgard.escapetime.api.`object`.game.GameObject
import lol.asgard.escapetime.api.`object`.gamer.Gamer
import lol.asgard.escapetime.api.util.sound.PlaySound
import org.bukkit.Location
import org.bukkit.block.Block

interface Puzzle : GameObject {
    var user: Gamer?
    var state: PuzzleState
    val pillar: Pillar
    val type: PuzzleType
    val buttons: List<PuzzleButton>
    val soundLocation: Location
    val activationBlock: Block
    var successfulTimes: Int

    fun playSound(playSound: PlaySound)
    fun activate(who: Gamer)
    fun deactivate()
    fun solved()
    fun remove()
    fun onFailure()
    fun onSuccess()
    fun clear()
}
