package ru.job4j.calculator;

/**
 * Calculate.
 *
 * @author Mikhail Pushkarev
 * @since 16.02.2020.
 * @version 1.0
 */

public class Calculator {
    /**
     * Method add.
     * @param first - first.
     * @param second - second.
     *
     */
    public static void add(double first, double second) {
        double v = first + second;
        System.out.println(first + " + " + second + " = " + v);
    }

    /**
     * Method div.
     * @param first - first.
     * @param second - second.
     *
     */
    public static void div(double first, double second) {
        double v = first / second;
        System.out.println(first + " / " + second + " = " + v);
    }

    /**
     * Method multiply.
     * @param first - first.
     * @param second - second.
     *
     */
    public static void multiply(double first, double second) {
        double v = first * second;
        System.out.println(first + " * " + second + " = " + v);
    }

    /**
     * Method subtrack.
     * @param first - first.
     * @param second - second.
     *
     */
    public static void subtrack(double first, double second) {
        double v = first - second;
        System.out.println(first + " - " + second + " = " + v);
    }

    /**
     * Main.
     * @param args - args.
     */
    public static void main(String[]args) {
        add(1, 1);
        div(2, 2);
        multiply(3, 3);
        subtrack(4, 4);
    }
}
