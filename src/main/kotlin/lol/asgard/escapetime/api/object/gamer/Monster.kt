package lol.asgard.escapetime.api.`object`.gamer

interface Monster {
    /**
     * Текущий тип монстра, если игрок монстр
     */
    var monsterType: MonsterType?
    /**
     * Превращает игрока в монстра текущего типа
     */
    fun turnIntoMonster()
    /**
     * Превращает игрока в монстра указанного типа
     */
    fun turnIntoMonster(type: MonsterType)
    /**
     * Превращает игрока из монстра в обычного игрока
     */
    fun turnIntoPlayer()
}