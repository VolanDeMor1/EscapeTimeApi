package lol.asgard.escapetime.api.`object`.game

interface Tickable {
    var lastTick: Long
    val tick: Double
    val tickMillis: Long

    fun tryTick()
    fun tick()
    fun isDoneForTick(): Boolean
    fun getNextTick(): Long
}