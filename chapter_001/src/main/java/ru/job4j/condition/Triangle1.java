package ru.job4j.condition;

/**
 * Triangle1
 *
 * @author Mikhail Pushkarev
 * @since 05.03.2020
 * @version 0.9
 */
public class Triangle1 {
    /**
     * Method exist - Метод должен сравнить стороны треугольника.
     * @param ab - Первая сторона.
     * @param ac - Вторая сторона.
     * @param bc - Третья сторона.
     * @return - Возвращает результат сравнения.
     */
    public static boolean exist(double ab, double ac, double bc) {
        boolean b = ab + ac > bc && ac + bc > ab && bc + ab > ac;
        return b;
    }
}
