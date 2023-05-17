package lol.asgard.escapetime.api.`object`.gamer.cosmetic

enum class PerkType(// todo IMPLEMENT
    val text: String, val cmd: Int, val level1: Float, val level2: Float, val level3: Float
) {
    ROLY_POLY("Акробат", 3000, 2f, 3f, 5f),
    SHADOW_WALKER("Ходок в тени", 3001, 0f, 0f, 0f),

    // todo IMPLEMENT
    LEAVE_NO_TRACE("Не оставляя следов", 3002, 0f, 0f, 0f),

    // todo IMPLEMENT
    THINK_FAST("Думай быстро!", 3003, 0f, 0f, 0f),

    // todo IMPLEMENT
    LEADERSHIP("Лидерство", 3004, 0f, 0f, 0f),

    // todo IMPLEMENT
    PUNCHING_BAG("Снарядная груша", 3005, 0f, 0f, 0f),

    // todo IMPLEMENT
    DISTANT_SAVIOR("Спасатель", 3006, 0f, 0f, 0f),

    // todo IMPLEMENT
    GENIUS("Гений", 3007, 0f, 0f, 0f),

    // todo IMPLEMENT
    MASTER_PIANIST("Мастер пианино", 3008, 0f, 0f, 0f);

    companion object {
        fun valueFromLevel(type: PerkType, level: Int): Float {
            return when (level) {
                1 -> type.level1
                2 -> type.level2
                3 -> type.level3
                else -> -1f
            }
        }
    }
}
