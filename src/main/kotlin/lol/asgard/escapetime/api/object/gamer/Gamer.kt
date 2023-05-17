package lol.asgard.escapetime.api.`object`.gamer

import lol.asgard.escapetime.api.`object`.gamer.cosmetic.Appearance
import lol.asgard.escapetime.api.`object`.gamer.cosmetic.Perk
import lol.asgard.escapetime.api.`object`.gamer.cosmetic.Sabotage
import org.bukkit.OfflinePlayer
import org.bukkit.entity.Player
import java.util.*

interface Gamer: lol.asgard.escapetime.api.`object`.game.GameObject {
    val id: Int
    val uuid: UUID?
    val offlinePlayer: OfflinePlayer?
    val settings: Settings?

    val perks: List<Perk>?
    val sabotages: List<Sabotage>
    val appearances: List<Appearance>

    val friends: List<UUID>?
    val blocked: List<UUID>?

    var placeType: PlaceType?
    var tokens: Int
    var credits: Int
    var level: Int
    var exp: Int
    var unlockedPerkSlots: Int
    var unlockedSabotageSlot: Boolean

    val leftHand: Hand?
    val rightHand: Hand?
    var status: GamerStatus?
    var nextRoll: Long
    var health: Int
    var monsterType: MonsterType?
    var rollAnimating: Boolean

    fun roll()
    fun player(): Player
    fun offlinePlayer(): Player

    fun addCredits(count: Int)
    fun addExp(count: Int)
    fun addLevel(count: Int)

    fun needExpToNextLevel(): Int
    fun needExp(level: Int): Int

    companion object {
        @JvmStatic
        fun of(player: Player): Gamer {
            throw NotImplementedError("This method is not implemented")
        }
        @JvmStatic
        fun of(player: OfflinePlayer): Gamer {
            throw NotImplementedError("This method is not implemented")
        }
    }

}