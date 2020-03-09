package ru.xpendence.jep_358_nullpointerexception;

/**
 * JEP 358: Конкретное объяснение NullPointerException.
 * При выбрасывании NPE в сообщении приводится, какой именно класс является null.
 *
 * Пример:
 *
 * Exception in thread "main" java.lang.NullPointerException: Cannot assign field "cities" because "countries" is null
 *     at Main.main(Main.java:21)
 *
 * @author Вячеслав Чернышов
 * @since 07.03.2020
 */
public class Main {

    public static void main(String[] args) {
        Planet planet = new Planet();
        planet.getCountries().forEach(c -> c.getCities().forEach(System.out::println));
    }
}
