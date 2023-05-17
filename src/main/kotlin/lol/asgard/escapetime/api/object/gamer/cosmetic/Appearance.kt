package lol.asgard.escapetime.api.`object`.gamer.cosmetic

import lol.asgard.escapetime.api.`object`.gamer.Gamer

class Appearance : Cosmetic {
    val type: AppearanceType

    /**
     * @param gamer Игрок который владеет этой косметикой
     * @param data Данные в формате: ТИП, АКТИВНОСТЬ...
     */
    constructor(gamer: Gamer, data: Array<String>) : super(gamer, data) {
        type = lol.asgard.escapetime.api.`object`.gamer.cosmetic.AppearanceType.valueOf(data[0])
    }

    constructor(gamer: Gamer, type: AppearanceType, active: Boolean) : super(gamer, type.name, active) {
        this.type = type
    }

    override fun toString(): String {
        return "Appearance{" +
                "type=" + type + ", " +
                "active=" + isActive +
                '}'
    }
}
