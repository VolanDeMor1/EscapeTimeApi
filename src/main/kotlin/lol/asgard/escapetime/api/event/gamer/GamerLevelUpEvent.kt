package lol.asgard.escapetime.api.event.gamer

import lol.asgard.escapetime.api.`object`.gamer.Gamer
import org.bukkit.entity.Player

/**
 * Вызывается когда игрок получает новый уровень
 * @param oldLevel Старый уровень
 * @param newLevel Новый уровеь
 */
class GamerLevelUpEvent(gamer: Gamer, player: Player, val oldLevel: Int, val newLevel: Int)
    : GamerEvent(gamer, player)