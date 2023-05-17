package lol.asgard.escapetime.api.`object`

import lol.asgard.escapetime.api.`object`.game.GameObject
import lol.asgard.escapetime.api.`object`.gamer.Gamer
import org.bukkit.Location
import org.bukkit.block.structure.StructureRotation
import org.bukkit.entity.Interaction
import org.bukkit.entity.Player

abstract class Lounge(val location: Location, rotation: StructureRotation) : GameObject {
    abstract val end: Location
    abstract val interaction: Interaction
    abstract val rotation: StructureRotation
    abstract val yaw: Float
    abstract var inside: Gamer?

    abstract fun click(player: Player)

    abstract fun remove()
}
