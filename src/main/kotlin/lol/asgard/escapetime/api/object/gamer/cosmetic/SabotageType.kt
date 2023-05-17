package lol.asgard.escapetime.api.`object`.gamer.cosmetic

import kotlin.math.ln

enum class SabotageType(val text: String, val cmd: Int, val coefficient: Double, val gap: Double) {
    FEEDING_FRENZY("Обжорство", 2000, 25.0, 1.5),
    BOOBYTRAP("Ночной кошмар", 2001, -1.0, -1.0),
    DIRECTIONLESS("Дезориентация", 2002, 17.0, 1.75),
    LIVING_NIGHTMARE("Ночной кошмар", 2003, 16.0, 1.75),
    NO_PACK("Без пака", 2004, 20.0, 1.75),
    NO_ESCAPE("Некуда бежать", 2005, 24.0, 1.75),
    SHUTDOWN("Завершение работы", 2006, 10.0, 3.25),
    TOTAL_LOCKDOWN("Полный локдаун", 2007, 23.0, 1.75);

    fun value(level: Int): Double {
        return ln(level * gap) * (coefficient + 1)
    }
}
