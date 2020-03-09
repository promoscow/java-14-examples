package ru.xpendence.jep_305_instanceof;

/**
 * JEP 305: Присвоение ссылки объекту через instanceof.
 *
 * Когда объект проходит проверку на instanceof, обычно следующим шагом является его кастомизация.
 * Теперь нам не надо этого делать. Мы можем сразу присвоить объекту ссылку.
 *
 * @author Вячеслав Чернышов
 * @since 07.03.2020
 */
public class Main {

    public static void main(String[] args) {
        Toy toy = new Toy("Джесика");
        showNameIfToyOldWay(toy);
        showNameIfToyNewWay(toy);
    }

    private static void showNameIfToyNewWay(Object o) {
        if (o instanceof Toy t) {
            System.out.println("Toy's name new way: " + t.getName());
        }
    }

    private static void showNameIfToyOldWay(Object o) {
        if (o instanceof Toy) {
            Toy t = (Toy) o;
            System.out.println("Toy's name old way: " + t.getName());
        }
    }
}
