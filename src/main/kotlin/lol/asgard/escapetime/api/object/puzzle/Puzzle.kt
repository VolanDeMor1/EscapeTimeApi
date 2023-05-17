package lol.asgard.escapetime.api.`object`.puzzle

import lol.asgard.escapetime.api.`object`.Pillar
import lol.asgard.escapetime.api.`object`.game.GameObject
import lol.asgard.escapetime.api.`object`.gamer.Gamer
import lol.asgard.escapetime.api.util.sound.PlaySound
import org.bukkit.Location
import org.bukkit.block.Block

abstract class Puzzle protected constructor(
    pillar: Pillar,
    val type: PuzzleType,
    duration: Double
) : GameObject {
    abstract var user: Gamer?
    abstract var state: PuzzleState
    abstract val pillar: Pillar
    abstract val buttons: List<PuzzleButton>
    abstract val soundLocation: Location
    abstract val activationBlock: Block
    abstract var successfulTimes: Int

    abstract fun playSound(playSound: PlaySound)

    abstract fun activate(who: Gamer)

    abstract fun deactivate()

    abstract fun solved()

    abstract fun remove()

    abstract fun onFailure()

    abstract fun onSuccess()

    abstract fun clear()
}
