package lol.asgard.escapetime.api.`object`.puzzle

import lol.asgard.escapetime.api.`object`.Pillar
import org.bukkit.Location

abstract class Reflex(pillar: Pillar) : Puzzle(pillar, PuzzleType.REFLEX, 1.0) {
    abstract var expiredAt: Long
    abstract var active: ReflexButton?

    abstract class ReflexButton(reflex: Reflex, location: Location) : PuzzleButton(reflex, location) {
        abstract fun active()
    }
}
