package ru.job4j.conditionTest;

/**
 * SqArea
 * @author Mikhail Pushkarev
 * @since 05.03.2020
 * @version 0.6
 */
public class SqArea {
    /**
     * Method square - Найти площадь.
     *
     * @param p - Принимает значение.
     * @param k - Принмает значение.
     * @return - Возвращает результат выражения.
     */

    public static double square(int p, int k) {
        double h = p  / (2 * (k + 1));
        double l = h * 2;
        double s = l * h;
        return s;
    }

    /**
     * Main
     *
     * @param args - Выводит результат на консоль.
     */
    public static void main(String[]args) {
        double v = square(4, 1);
        System.out.println("p = 4, k = 1, s = 1, real = " + v);
        double v1 = square(6, 2);
        System.out.println("p = 6, k = 2, s = 1, real = " + v1);
    }
}
