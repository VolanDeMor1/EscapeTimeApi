package lol.asgard.escapetime.api.`object`.puzzle

import org.bukkit.Location
import org.bukkit.entity.Interaction
import org.bukkit.entity.ItemDisplay

interface PuzzleButton {
    val puzzle: Puzzle
    val location: Location
    var display: ItemDisplay?
    var interaction: Interaction?

    fun spawn(loc: Location)
    fun click()
    fun solved()
    fun clear()
    fun remove()
    fun resetInteraction(newInteraction: Interaction?)
}
