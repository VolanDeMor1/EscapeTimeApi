package lol.asgard.escapetime.api.`object`.puzzle

interface Memory : Puzzle {
    var blink: Int
    var answer: List<MemoryButton>?
    var success: Boolean

    interface MemoryButton : PuzzleButton {
        var isClicked: Boolean
        fun wrong()
        fun correct()
        fun blink(delay: Long = 18L)
    }
}
