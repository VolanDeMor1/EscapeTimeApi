package lol.asgard.escapetime.api.`object`.puzzle

import lol.asgard.escapetime.api.`object`.Pillar
import org.bukkit.Location

abstract class Memory(pillar: Pillar) : Puzzle(pillar, PuzzleType.MEMORY, 1.0) {
    abstract var blink: Int
    abstract var answer: List<MemoryButton>?
    abstract var success: Boolean

    abstract class MemoryButton(memory: Memory, location: Location) : PuzzleButton(memory, location) {
        abstract var isClicked: Boolean
        abstract fun wrong()
        abstract fun correct()
        abstract fun blink(delay: Long = 18L)
    }
}
