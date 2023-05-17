package lol.asgard.escapetime.api.`object`.puzzle

interface Reflex: Puzzle {
    var expiredAt: Long
    var active: ReflexButton?

    interface ReflexButton: PuzzleButton<Reflex> {
        fun active()
    }
}
