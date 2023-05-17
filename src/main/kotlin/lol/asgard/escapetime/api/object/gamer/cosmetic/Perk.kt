package lol.asgard.escapetime.api.`object`.gamer.cosmetic

import lol.asgard.escapetime.api.`object`.gamer.Gamer
import java.util.function.Predicate

interface Perk : LevelCosmetic {
    val type: PerkType

    companion object {
        @JvmStatic
        fun get(gamer: Gamer, type: PerkType): Float {
            throw NotImplementedError("This method is not implemented")
        }

        @JvmStatic
        fun orElse(gamer: Gamer, type: PerkType?, def: Float): Float {
            throw NotImplementedError("This method is not implemented")
        }
    }
}
