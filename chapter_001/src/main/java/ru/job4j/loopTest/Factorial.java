package ru.job4j.loopTest;

/**
 * Factorial
 *
 * @author Mikhail Pushkarev
 * @since 05.03.2020
 * @version 0.14
 */
public class Factorial {
    /**
     * Method calc - Выполнение факториала.
     * @param n - Принимает значение.
     * @return - Возвращает результат факториала.
     */
    public static int calc(int n) {
        int i1 = 1;
        for (int i = 1; i <= n; i++) {
            i1 = i1 * i;
        }
        return i1;
    }
}
