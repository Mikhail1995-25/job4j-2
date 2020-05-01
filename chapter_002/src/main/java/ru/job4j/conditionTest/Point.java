package ru.job4j.conditionTest;

import static java.lang.Math.*;

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
    private int z;

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
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
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
     * Method distance
     * @param that - Принимает значение объекта для вычесления квадратного корня.
     * @return - возвращает расстояние между точками координат.
     */
    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    /**
     * Main
     * @param args - Выводит результат на консоль.
     */
    public static void main(String[] args) {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 2);
        double dist = a.distance3d(b);
        System.out.println(dist);
    }
}
