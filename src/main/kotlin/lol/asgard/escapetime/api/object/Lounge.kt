package lol.asgard.escapetime.api.`object`

import lol.asgard.escapetime.api.`object`.game.GameObject
import lol.asgard.escapetime.api.`object`.gamer.Gamer
import org.bukkit.Location
import org.bukkit.block.structure.StructureRotation
import org.bukkit.entity.Interaction
import org.bukkit.entity.Player

interface Lounge: GameObject {
    val end: Location
    val interaction: Interaction
    val rotation: StructureRotation
    val yaw: Float
    var inside: Gamer?

    fun click(player: Player)
    fun remove()
}
