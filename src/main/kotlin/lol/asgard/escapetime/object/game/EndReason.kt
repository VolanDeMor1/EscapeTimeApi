package lol.asgard.escapetime.`object`.game

enum class EndReason(val text: String) {
    SUCCESS("Успех!"),
    ALL_DIED("Все умерли"),
    TIME_END("Время закончилось"),
    INTERRUPTED("Игра прервана"),
    UNKNOWN("Неизвестная причина");
}