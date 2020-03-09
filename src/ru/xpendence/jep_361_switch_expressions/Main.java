package ru.xpendence.jep_361_switch_expressions;

import java.time.LocalDate;

/**
 * Описание класса: пару слов что это такое и для чего нужен.
 *
 * @author Вячеслав Чернышов
 * @since 07.03.2020
 */
public class Main {

    public static void main(String[] args) {

        translateDayOfWeek("1");
        translateDayOfWeekOld("1");
    }

    public static void translateDayOfWeek(String dayOfWeek) {
        switch (dayOfWeek) {
            case "MONDAY" -> System.out.println("Понедельник");
            case "TUESDAY" -> System.out.println("Вторник");
            case "WEDNESDAY" -> System.out.println("Среда");
            case "THURSDAY" -> System.out.println("Четверг");
            case "FRIDAY" -> System.out.println("Пятница");
            case "SATURDAY" -> System.out.println("Суббота");
            case "SUNDAY" -> System.out.println("Воскресенье");
            default -> {
                System.out.println("Day of week not found, try again with today day of week");
                String displayName = LocalDate.now().getDayOfWeek().name();
                translateDayOfWeek(displayName);
            }
        }
    }

    public static void translateDayOfWeekOld(String dayOfWeek) {
        switch (dayOfWeek) {
            case "MONDAY":
                System.out.println("Понедельник");
                break;
            case "TUESDAY":
                System.out.println("Вторник");
                break;
            case "WEDNESDAY":
                System.out.println("Среда");
                break;
            case "THURSDAY":
                System.out.println("Четверг");
                break;
            case "FRIDAY":
                System.out.println("Пятница");
                break;
            case "SATURDAY":
                System.out.println("Суббота");
                break;
            case "SUNDAY":
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Day of week not found, try again with today day of week");
                String displayName = LocalDate.now().getDayOfWeek().name();
                translateDayOfWeek(displayName);
        }
    }
}
