package ru.job4j.calculator;

/**
 * Fit
 *
 * @author Mikhail Pushkarev
 * @since 05.03.2020
 * @version 0.3
 */
public class Fit {
    /**
     * manWeight - Метод выполняяет идеальный вес для мужчин.
     *
     * @param height - Параметр принимает число в формулу.
     * @return - Возвращает результат вычесления формулы.
     */

    public static double manWeight(double height) {
        double weight = (height - 100) * 1.15;
        return weight;
    }

    /**
     * womanWeight - Метод выполняет идеальный вес для женщин.
     *
     * @param height - Параметр принимает значение в формулу.
     * @return - Возвращает результат вычесления формулы.
     */
    public static double womanWeight(double height) {
    double weight = (height - 110) * 1.15;
    return weight;
    }

    /**
     * Main
     *
     * @param args - Выводит результат на консоль.
     */
    public static void main(String[]args) {
        double man = manWeight(174);
        System.out.println("Man 100 is " + man);
        double woman = womanWeight(170);
        System.out.println("Woman 110 is " + woman);

    }
}
