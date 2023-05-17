package lol.asgard.escapetime.`object`.gamer.cosmetic

import lol.asgard.escapetime.`object`.gamer.Gamer

abstract class LevelCosmetic : Cosmetic {
    var level: Int

    /**
     * @param gamer Игрок который владеет этой косметикой
     * @param data  Данные в формате: ТИП, АКТИВНОСТЬ...
     */
    constructor(gamer: Gamer, data: Array<String>) : super(gamer, data) {
        level = data[2].toInt()
    }

    /**
     * @param gamer Игрок который владеет этой косметикой
     * @param typeName Название типа (Должно точно совпадать с именем в Enum)
     * @param active Активна ли эта косметика
     * @param level Уровень косметики
     */
    constructor(gamer: Gamer, typeName: String?, active: Boolean, level: Int) : super(gamer, typeName!!, active) {
        this.level = level
    }
}
