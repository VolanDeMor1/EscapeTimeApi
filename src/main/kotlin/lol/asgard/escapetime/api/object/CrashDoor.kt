package lol.asgard.escapetime.api.`object`

import lol.asgard.escapetime.api.`object`.game.GameObject
import org.bukkit.Location
import org.bukkit.Sound
import org.bukkit.block.Block
import org.bukkit.entity.Interaction
import org.bukkit.entity.ItemDisplay

interface CrashDoor : GameObject {
    val location: Location
    val interaction: Interaction
    val toFill: HashSet<Block>
    val handle: HashSet<Block>
    val itemDisplay: ItemDisplay
    var closed: Boolean

    fun click()
    fun close()
    fun open()
    fun playSound(sound: Sound?, volume: Float, pitch: Float)
    fun remove()
}
