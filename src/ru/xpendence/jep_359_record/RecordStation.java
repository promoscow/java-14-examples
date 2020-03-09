package ru.xpendence.jep_359_record;

import java.util.List;

/**
 * Описание класса: пару слов что это такое и для чего нужен.
 *
 * @author Вячеслав Чернышов
 * @since 07.03.2020
 */
public record RecordStation(String name, List<Coordinates> coordinates) {}
