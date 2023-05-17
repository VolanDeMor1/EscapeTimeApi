package lol.asgard.escapetime.`object`.puzzle

enum class PuzzleType(val text: String, val clazz: Class<*>) {
    MEMORY("Память", Memory::class.java),
    PIANO("Пианино", Piano::class.java),
    REFLEX("Рефлекс", Reflex::class.java),
    WIRING("Провода", Wiring::class.java)
}
