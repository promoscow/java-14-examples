package ru.xpendence.jep_359_record;

import java.util.Objects;

/**
 * Описание класса: пару слов что это такое и для чего нужен.
 *
 * @author Вячеслав Чернышов
 * @since 08.03.2020
 */
public class PlainStation {

    private String name;
    private Coordinates coordinates;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlainStation that = (PlainStation) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(coordinates, that.coordinates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, coordinates);
    }

    @Override
    public String toString() {
        return "PlainStation{" +
                "name='" + name + '\'' +
                ", coordinates=" + coordinates +
                '}';
    }
}
