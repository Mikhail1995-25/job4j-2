package ru.job4j.calculator;

/**
 * Calculatror4
 *
 * @author Mikhail Pushkarev
 * @since 05.03.2020
 * @varsion 0.1
 */

public class Calculator4 {
    /**
     * Method plus - Производит сложение, но  не возвращает.
     * @param first - Первое число.
     * @param second - Второе число.
     */
    public static void plus(int first, int second) {
        int i = first + second;
        System.out.println(i);
    }

    /**
     * Main
     * @param args - Выводит на консоль результат сложения.
     */
    public static void main(String[]args) {
        plus(100, 500);
        plus(4, 2);
        plus(3, 5);
    }
}

