package lol.asgard.escapetime.`object`.gamer

import net.kyori.adventure.text.format.TextColor

enum class GamerStatus(val text: String, val symbol: String, val color: TextColor) {
    LOBBY("В лобби", "\uE200", TextColor.color(0xA9AEC2)),
    ALIVE("Живой", "\uE200", TextColor.color(0xC82D)),
    CAPTURED("Схвачен", "\uE200", TextColor.color(0xE08700)),
    IN_PIT("В яме", "\uE200", TextColor.color(0xD62800)),
    DEAD("Мёртв", "\uE200", TextColor.color(0x646464))
}
