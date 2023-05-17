package lol.asgard.escapetime.`object`

enum class ToyType(
    val head: Int,
    val body: Int,
    val handLeft: Int,
    val handRight: Int,
    val legLeft: Int,
    val legRight: Int
) {
    CAT(1000, 1001, 1002, 1003, 1004, 1005);

    val parts: List<Int>

    init {
        parts = java.util.List.of(head, body, handLeft, handRight, legLeft, legRight)
    }
}