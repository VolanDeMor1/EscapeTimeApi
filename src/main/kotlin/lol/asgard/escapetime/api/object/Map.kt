package lol.asgard.escapetime.api.`object`

import lol.asgard.escapetime.api.`object`.game.GameObject
import org.bukkit.Location
import org.bukkit.World

interface Map: GameObject {
    val type: MapType
    val world: World
    val pillars: MutableList<Pillar>
    val spawnLocations: MutableList<Location>
    val monsterLocation: Location

    fun remove()
    fun randomSpawnLocation(): Location
}
