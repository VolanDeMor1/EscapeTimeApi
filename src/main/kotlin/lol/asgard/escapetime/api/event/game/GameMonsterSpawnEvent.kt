package lol.asgard.escapetime.api.event.game

import lol.asgard.escapetime.api.`object`.game.Game
import lol.asgard.escapetime.api.`object`.gamer.Monster

class GameMonsterSpawnEvent(val monster: Monster, game: Game) : GameEvent(game)