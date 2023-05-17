package lol.asgard.escapetime.`object`.gamer

import lol.asgard.escapetime.`object`.puzzle.Puzzle
import org.bukkit.entity.ThrownPotion

interface Hand {
    var grubbingAt: Puzzle?
    var action: HandActionType
    var potion: ThrownPotion?

    fun click()
    fun grub()
    fun ungrub()
    fun remove()
}
