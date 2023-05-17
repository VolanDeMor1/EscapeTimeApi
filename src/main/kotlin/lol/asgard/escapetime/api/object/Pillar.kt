package lol.asgard.escapetime.api.`object`

import lol.asgard.escapetime.api.`object`.game.GameObject
import lol.asgard.escapetime.api.`object`.puzzle.Puzzle
import lol.asgard.escapetime.api.`object`.puzzle.PuzzleType
import lol.asgard.escapetime.api.util.sound.PlaySound
import org.bukkit.Location
import org.bukkit.block.Block
import java.util.*

interface Pillar: GameObject {
    val location: Location
    val uniqueId: UUID
    val activationButtons: HashMap<Block, Puzzle>
    val puzzles: HashMap<PuzzleType, Puzzle>
    val end: Location
    var state: PillarState
    var lastPuzzle: Puzzle?

    fun playSound(playSound: PlaySound)
    fun spawnToyPart()
    fun remove()
    fun addActivationButton(puzzle: Puzzle, block: Block)
}
