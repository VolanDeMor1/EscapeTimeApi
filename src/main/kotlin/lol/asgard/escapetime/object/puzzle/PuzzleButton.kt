package lol.asgard.escapetime.`object`.puzzle

import org.bukkit.Location
import org.bukkit.entity.Interaction
import org.bukkit.entity.ItemDisplay

abstract class PuzzleButton protected constructor(@JvmField val puzzle: Puzzle, val location: Location) {
    var display: ItemDisplay? = null
    var interaction: Interaction? = null

    abstract fun spawn(loc: Location)

    abstract fun click()
    abstract fun solved()
    abstract fun clear()
    abstract fun remove()
    abstract fun setInteraction(interaction: Interaction)
}
