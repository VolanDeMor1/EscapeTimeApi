package lol.asgard.escapetime.api.`object`.gamer.cosmetic

import lol.asgard.escapetime.api.`object`.gamer.Gamer

interface Cosmetic {
    val gamer: Gamer
    val typeString: String
    var isActive: Boolean
}
