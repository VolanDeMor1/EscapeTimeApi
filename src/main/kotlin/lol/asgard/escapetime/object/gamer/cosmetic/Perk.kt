package lol.asgard.escapetime.`object`.gamer.cosmetic

import lol.asgard.escapetime.`object`.gamer.Gamer
import java.util.function.Predicate

class Perk : LevelCosmetic {
    val type: PerkType

    /**
     * @param gamer Игрок который владеет этой косметикой
     * @param data Данные в формате: ТИП, АКТИВНОСТЬ, УРОВЕНЬ...
     */
    constructor(gamer: Gamer, data: Array<String>) : super(gamer, data) {
        type = PerkType.valueOf(data[0])
    }

    /**
     * @param gamer Игрок который владеет этой косметикой
     * @param active Активна ли эта косметика
     * @param level Уровень косметики
     * @param type Тип перки
     */
    constructor(gamer: Gamer, type: PerkType, active: Boolean, level: Int) : super(gamer, type.name, active, level) {
        this.type = type
    }

    override fun toString(): String {
        return "Perk{" +
                "type=" + type + ", " +
                "active=" + isActive + ", " +
                "level=" + level +
                '}'
    }

    companion object {
        fun get(gamer: Gamer, type: PerkType): Float {
            val needed: Perk? = gamer.perks?.firstOrNull { it.type == type && it.isActive };
            return if (needed == null) 0f else PerkType.valueFromLevel(type, needed.level)
        }

        fun orElse(gamer: Gamer, type: PerkType?, def: Float): Float {
            val needed: Perk? = gamer.perks?.firstOrNull { it.type == type && it.isActive };
            return if (needed == null) def else PerkType.valueFromLevel(type!!, needed.level)
        }
    }
}
