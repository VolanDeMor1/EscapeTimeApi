package lol.asgard.escapetime.api.`object`.gamer.cosmetic

import lol.asgard.escapetime.api.`object`.gamer.Gamer

class Sabotage : LevelCosmetic {
    val type: SabotageType

    /**
     * @param gamer Игрок который владеет этой косметикой
     * @param data Данные в формате: ТИП, АКТИВНОСТЬ, УРОВЕНЬ...
     */
    constructor(gamer: Gamer, data: Array<String>) : super(gamer, data) {
        type = SabotageType.valueOf(data[0])
    }

    constructor(gamer: Gamer, type: SabotageType, active: Boolean, level: Int) : super(
        gamer,
        type.name,
        active,
        level
    ) {
        this.type = type
    }

    override fun toString(): String {
        return "Sabotage{" +
                "type=" + type + ", " +
                "active=" + isActive + ", " +
                "level=" + level +
                '}'
    }
}
