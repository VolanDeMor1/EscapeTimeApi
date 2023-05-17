package lol.asgard.escapetime.`object`

import lol.asgard.escapetime.`object`.game.GameObject
import org.bukkit.entity.Interaction
import org.bukkit.entity.ItemDisplay

abstract class ToyPart(pillar: Pillar) : GameObject {
    abstract val pillar: Pillar
    abstract val interaction: Interaction
    abstract val itemDisplay: ItemDisplay
    abstract val cmd: Int

    abstract fun remove()
}
