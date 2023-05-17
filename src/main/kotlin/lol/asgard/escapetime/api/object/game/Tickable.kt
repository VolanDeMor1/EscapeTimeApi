package lol.asgard.escapetime.api.`object`.game

interface Tickable {
    var lastTick: Long
    var tick: Double
    var tickMillis: Long

    fun tryTick()
    fun tick()
    fun isDoneForTick(): Boolean
    fun getNextTick(): Long
}