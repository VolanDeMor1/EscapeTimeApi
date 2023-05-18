package lol.asgard.escapetime.api.event.game

import lol.asgard.escapetime.api.`object`.game.Game
import lol.asgard.escapetime.api.`object`.gamer.Gamer

class GameMonsterSpawnEvent(val monster: Gamer, game: Game) : GameEvent(game)