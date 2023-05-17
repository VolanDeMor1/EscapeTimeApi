package lol.asgard.escapetime.`object`.gamer

data class Settings(
        val gamer: Gamer,
        var foreground: String,
        var background: String,
        var nickname: String
) {
    constructor(gamer: Gamer) : this(gamer, "#009999", "#FFFFFF", "#FFFFFF")
}
