package ru.job4j.oop;


import ru.job4j.condition.Point;

/**
 * Triangle
 * @author Mikhail Pushkarev
 * @since 15.03.2020
 * @version 2.2
 */
public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Метод вычесления периметра по длинам сторон.
     * формула
     * (a + b + c) / 2
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return периметр.
     */
    public double period(double a, double b, double c) {
        double p = (a + b + c) / 2;
       return p;
    }

    /**
     * Метод должен вычислить площадь треугольника.
     * формула.
     * √ p * (p - ab) * (p - ac) * (p - bc)
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     * @return вернуть площадь, если треугольник существует или -1
     */
    public double area() {
        double rs1 = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rs1 = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rs1;
        
    }

    /**
     * метод проверяет можно ли построить треугольник с такими длинами сторон.
     * @param a длина точки a b.
     * @param c длина точки a c.
     * @param b длина точки b c.
     * @return
     */
    private boolean exist(double a, double c, double b) {
        return a < b + c && a < c + b && b < c + a;
    }
}
