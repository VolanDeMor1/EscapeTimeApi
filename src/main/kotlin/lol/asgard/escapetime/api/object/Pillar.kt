package lol.asgard.escapetime.api.`object`

import lol.asgard.escapetime.api.`object`.game.GameObject
import lol.asgard.escapetime.api.`object`.puzzle.Puzzle
import lol.asgard.escapetime.api.`object`.puzzle.PuzzleType
import lol.asgard.escapetime.api.util.sound.PlaySound
import org.bukkit.Location
import org.bukkit.block.Block
import java.util.*

abstract class Pillar(val location: Location) : GameObject {
    abstract val uniqueId: UUID
    abstract val activationButtons: HashMap<Block, Puzzle>
    abstract val puzzles: HashMap<PuzzleType, Puzzle>
    abstract val end: Location
    abstract var state: PillarState
    abstract var lastPuzzle: Puzzle?

    abstract fun playSound(playSound: PlaySound)
    abstract fun spawnToyPart()
    abstract fun remove()
    abstract fun addActivationButton(puzzle: Puzzle, block: Block)
}
