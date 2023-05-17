package lol.asgard.escapetime.util.sound

import org.bukkit.Location
import org.bukkit.Sound

data class PlaySound(val sound: Sound, val volume: Float, val pitch: Float) {
    fun play(location: Location) {
        location.world.playSound(location, sound, volume, pitch)
    }
}
