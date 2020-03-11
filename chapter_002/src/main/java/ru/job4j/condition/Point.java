package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Point
 * @author Mikhail Pushkarev
 * @since 11.03.2020
 * @version 2.1
 */
public class Point {
    /**
     * Поле объекта доступно определенному объекту.
     */
    private int x;
    /**
     * Поле объекта доступно определенному объекту.
     */
    private int y;

    /**
     * Konstructor Point
     *
     * @param first - Инициализация значением.
     * @param second - Инициализация значением.
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Method distance
     * @param that - Принимает значение объекта для вычисления квадратного корня.
     * @return - Возвращает расстояние между точками координат.
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * Main
     * @param args - Выводит результат на консоль.
     */
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
