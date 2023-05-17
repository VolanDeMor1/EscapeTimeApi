package lol.asgard.escapetime.api.`object`.puzzle

import lol.asgard.escapetime.api.`object`.Pillar
import org.apache.commons.lang3.tuple.Pair
import org.bukkit.Location
import org.bukkit.Material
import java.util.*

interface Wiring : Puzzle {
    var blink: Int
    var answer: List<Pair<WiringButton, WiringButton>>?
    var shouldNext: WiringButton?

    interface WiringButton : PuzzleButton {
        val uuid: UUID
        var type: WiringType?
        val right: Boolean
        var clicked: Boolean
        var solved: Boolean
        var pair: WiringButton?

        fun select()
        fun blink(delay: Long = 18L)

        fun failure()

        val left: Boolean
            get() = !right
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
