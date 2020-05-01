package ru.job4j.conditionTest;

/**
 * TrgArea
 *
 * @author Mikhail Pushkarev
 * @since 05.03.2020
 * @version 0.7
 */
public class TrgArea {
    /**
     * Method area - Найти площадь треугольника.
     * @param a - Первое значение.
     * @param b - Второе значение.
     * @param c - Третье значение.
     * @return - Возвращает выполненный результат.
     */
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    /**
     * Main
     * @param args - Выводит результат на консоль.
     */
    public static void main(String[]args) {
        double v = area(2, 2, 2);
        System.out.println("area(2, 2, 2) = " + v);
    }
}
