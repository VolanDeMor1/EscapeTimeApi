package lol.asgard.escapetime.api.`object`

import lol.asgard.escapetime.api.`object`.game.GameObject
import org.bukkit.Location
import org.bukkit.World

abstract class Map(val type: MapType, val world: World) :
    GameObject {
    abstract val pillars: MutableList<Pillar>
    abstract val spawnLocations: MutableList<Location>
    abstract val monsterLocation: Location

    abstract fun remove()
    abstract fun randomSpawnLocation(): Location
}