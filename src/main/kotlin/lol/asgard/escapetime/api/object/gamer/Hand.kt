package lol.asgard.escapetime.api.`object`.gamer

import lol.asgard.escapetime.api.`object`.puzzle.Puzzle
import org.bukkit.entity.ThrownPotion

interface Hand {
    /**
     * За какой паззл хватается
     */
    var grubbingAt: Puzzle?

    /**
     * Текущее состояние руки
     */
    var action: HandActionType

    /**
     * Отправленная рука в мире, либо null если в состоянии покоя
     */
    var potion: ThrownPotion?

    /**
     * Игрок, который владеет этой рукой
     */
    fun getGamer(): Gamer

    /**
     * Выполняет "нажатие" руки, это может быть как запуск руки так и её возврат
     */
    fun click()

    /**
     * Если рука в состоянии покоя - запускает её, иначе выполняет возврат в исходное положение
     */
    fun grub()

    /**
     * Возврат руки в исходное положение
     */
    fun ungrub()

    /**
     * Моментальное удаление руки из мира, и возврат в исходное положение
     */
    fun remove()
}
