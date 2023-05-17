package lol.asgard.escapetime.`object`.puzzle

import lol.asgard.escapetime.`object`.Pillar
import org.apache.commons.lang3.tuple.Pair
import org.bukkit.Location
import org.bukkit.Material
import java.util.*

abstract class Wiring(pillar: Pillar) : Puzzle(pillar, PuzzleType.WIRING, 1.0) {
    abstract var blink: Int
    abstract var answer: List<Pair<WiringButton, WiringButton>>?
    abstract var shouldNext: WiringButton?

    abstract class WiringButton(wiring: Wiring, val isRight: Boolean, location: Location) : PuzzleButton(wiring, location) {
        abstract val uuid: UUID
        abstract var type: WiringType?
        abstract var clicked: Boolean
        abstract var solved: Boolean
        abstract var pair: WiringButton?

        abstract fun select()
        abstract fun blink(delay: Long = 18L)

        abstract fun failure()

        val isLeft: Boolean
            get() = !isRight
    }

    enum class WiringType(val text: String, material: Material, customModelData: Int) {
        PURPLE("Фиолетовый", Material.PURPLE_CONCRETE, 666779),
        BLUE("Синий", Material.BLUE_CONCRETE, 666774),
        RED("Красный", Material.RED_CONCRETE, 666780),
        YELLOW("Жёлтый", Material.YELLOW_CONCRETE, 666781);

        val material: Material
        val customModelData: Int

        init {
            this.material = material
            this.customModelData = customModelData
        }
    }
}
