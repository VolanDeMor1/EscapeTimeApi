package lol.asgard.escapetime.api.`object`.gamer

import lol.asgard.escapetime.api.`object`.game.GameObject
import lol.asgard.escapetime.api.`object`.gamer.cosmetic.Appearance
import lol.asgard.escapetime.api.`object`.gamer.cosmetic.Perk
import lol.asgard.escapetime.api.`object`.gamer.cosmetic.Sabotage
import lol.asgard.escapetime.api.event.gamer.GamerLevelUpEvent
import org.bukkit.OfflinePlayer
import org.bukkit.entity.Player
import java.util.*

interface Gamer: GameObject, Monster {
    /**
     * Уникальный идентификатор в базе данных EscapeTime
     */
    val id: Int

    /**
     * Уникальный идентификатор Minecraft
     */
    val uuid: UUID

    /**
     * Кешированный (если уже вызывался Gamer.getOfflinePlayer()) оффлайн игрок
     * @see getOfflinePlayer
     */
    val cachedOfflinePlayer: OfflinePlayer?

    /**
     * Настройки этого игрока
     */
    val settings: Settings

    /**
     * Все имеющиеся перки этого игрока
     */
    val perks: List<Perk>

    /**
     * Все имеющиеся саботажи этого игрока
     */
    val sabotages: List<Sabotage>

    /**
     * Все имеющиеся косметики внешнего вида этого игрока
     */
    val appearances: List<Appearance>

    /**
     * Список друзей этого игрока
     */
    val friends: List<UUID>

    /**
     * Список заблокированных игроков
     */
    val blocked: List<UUID>

    /**
     * Тип места в котором находится игрок, null если он оффлайн
     */
    var placeType: PlaceType?

    /**
     * Количество имеющихся токенов
     */
    var tokens: Int

    /**
     * Количество имеющихся кредитов
     */
    var credits: Int

    /**
     * Количество уровней
     */
    var level: Int

    /**
     * Количество опыта
     */
    var exp: Int

    /**
     * Количество открытых слотов для перок
     */
    var unlockedPerkSlots: Int

    /**
     * Открыт ли слот для саботажа
     */
    var unlockedSabotageSlot: Boolean

    /**
     * Левая рука
     */
    val leftHand: Hand

    /**
     * Правая рука
     */
    val rightHand: Hand

    /**
     * Текущий статус игрока
     */
    var status: GamerStatus

    /**
     * Когда будет доступен следующий ролл
     */
    var nextRoll: Long

    /**
     * Здоровье игрока
     */
    var health: Int

    /**
     * Анимируется ли ролл в HUD
     */
    @Deprecated("Заменится полностью")
    var rollAnimating: Boolean

    /**
     * Сделать ролл (кувырок)
     */
    fun roll()

    /**
     * Получить игрока если он на сервере
     */
    fun getPlayer(): Player?

    /**
     * Получить оффлайн игрока и записать его в Gamer.cachedOfflinePlayer
     * @see Gamer.cachedOfflinePlayer
     */
    fun getOfflinePlayer(): OfflinePlayer

    /**
     * Добавить кредитов игроку
     */
    fun addCredits(count: Int)

    /**
     * Добавить опыта игроку, также повысит уровень если будет достигнут Gamer.getExpToNextLevel()
     * @see Gamer.getExpToNextLevel
     */
    fun addExp(count: Int)

    /**
     * Добавить уровень игроку, также откроет слоты если уровень будет достигнут определённого значения.
     * Вызывает GamerLevelUpEvent
     * @see GamerLevelUpEvent
     */
    fun addLevel(count: Int)

    /**
     * Необходимое количество опыта до следующего уровня
     */
    fun getExpToNextLevel(): Int
    /**
     * Необходимое количество опыта до уровня
     */
    fun getExp(level: Int): Int

}