package lol.asgard.escapetime.api.`object`.gamer.cosmetic

import lol.asgard.escapetime.api.`object`.gamer.Gamer

abstract class Cosmetic {
    val gamer: Gamer
    val typeString: String
    var isActive: Boolean

    /**
     * @param gamer Игрок который владеет этой косметикой
     * @param data Данные в формате: ТИП, АКТИВНОСТЬ...
     */
    constructor(gamer: Gamer, data: Array<String>) {
        this.gamer = gamer
        typeString = data[0]
        isActive = data.size > 1 && data[1].toBoolean()
    }

    /**
     * @param gamer Игрок который владеет этой косметикой
     * @param typeName Название типа (Должно точно совпадать с именем в Enum)
     * @param active Активна ли эта косметика
     */
    constructor(gamer: Gamer, typeName: String, active: Boolean) {
        this.gamer = gamer
        typeString = typeName
        isActive = active
    }
}
