package lol.asgard.escapetime.api.`object`

import net.kyori.adventure.text.format.TextColor

enum class MapType(
    val text: String, val resource: String, val color: TextColor, val monsterLocation: List<Double>,
    val pillarLocations: List<List<Double>>, loungesLocations: List<List<Double>>, val spawnLocations: List<List<Double>>
) {
    THEATRE(
        "Театр", "theatre", TextColor.color(0xFFD800),
        listOf(32.5, -48.9, 191.5),  // MONSTER
        // PILLARS
        listOf(
            listOf(45.5, -51.0, 69.5), listOf(-9.5, -51.0, 103.5),
            listOf(23.5, -43.0, 97.5)
        ), listOf(),  // SPAWNS
        listOf(
            listOf(46.5, -55.9, 40.5), listOf(33.5, -55.9, 40.5),
            listOf(27.5, -55.9, 40.5), listOf(14.5, -55.9, 40.5)
        )
    );
}
