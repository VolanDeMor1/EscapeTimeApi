package lol.asgard.escapetime.api.`object`

import lol.asgard.escapetime.api.`object`.game.GameObject
import org.bukkit.entity.Interaction
import org.bukkit.entity.ItemDisplay

interface ToyPart: GameObject {
    val pillar: Pillar
    val interaction: Interaction
    val itemDisplay: ItemDisplay
    val cmd: Int

    fun remove()
}
