package ru.xpendence.jep_359_record;

/**
 * Описание класса: пару слов что это такое и для чего нужен.
 *
 * @author Вячеслав Чернышов
 * @since 07.03.2020
 */
public record Coordinates(Double latitude, Double longitude) {

    public static String staticString;
}
