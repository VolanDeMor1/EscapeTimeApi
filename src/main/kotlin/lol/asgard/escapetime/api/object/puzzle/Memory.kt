package lol.asgard.escapetime.api.`object`.puzzle

interface Memory : Puzzle {
    var blink: Int
    var answer: List<MemoryButton>
    var success: Boolean

    interface MemoryButton : PuzzleButton<Memory> {
        var isClicked: Boolean
        fun wrong()
        fun correct()
        fun blink()
        fun blink(delay: Long = 18L)
    }
}
