package ru.job4j.condition;

/**
 * Point
 *
 * @author Mikhail Pushkarev
 * @since 05.03.2020
 * @version 0.6
 */
public class Point {
    /**
     * Method distance - Производит вычесление квадратного уравнения.
     * @param x1 - Принимает первое значение.
     * @param y1 - Принимает второе значение.
     * @param x2 - Принимает третье значение.
     * @param y2 - Принимает четвертое значение.
     * @return - Возвращает результат вычесления квдратного уравнения.
     */
    public static double distance(int x1, int y1, int x2, int y2) {
        double x = Math.pow((x2 - x1), 2);
        double y = Math.pow((y2 - y1), 2);
        double a = Math.sqrt(x + y);
        return a;
    }

    /**
     * Main
     * @param args - Параметр выводит на консоль результат вычесления.
     */
    public static void main(String[]args) {
        double result = distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }



}
