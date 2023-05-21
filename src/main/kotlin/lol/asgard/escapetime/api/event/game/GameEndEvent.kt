package lol.asgard.escapetime.api.event.game

import lol.asgard.escapetime.api.`object`.game.EndReason
import lol.asgard.escapetime.api.`object`.game.Game

class GameEndEvent(game: Game, val reason: EndReason) : GameEvent(game)