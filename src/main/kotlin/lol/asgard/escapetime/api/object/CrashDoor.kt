package lol.asgard.escapetime.api.`object`

import lol.asgard.escapetime.api.`object`.game.GameObject
import org.bukkit.Location
import org.bukkit.Sound
import org.bukkit.block.Block
import org.bukkit.entity.Interaction
import org.bukkit.entity.ItemDisplay

abstract class CrashDoor(location: Location) : GameObject {
    abstract val location: Location
    abstract val interaction: Interaction
    abstract val toFill: HashSet<Block>
    abstract val handle: HashSet<Block>
    abstract val itemDisplay: ItemDisplay
    abstract var closed: Boolean

    abstract fun click()
    abstract fun close()
    abstract fun open()
    abstract fun playSound(sound: Sound?, volume: Float, pitch: Float)
    abstract fun remove()

}
