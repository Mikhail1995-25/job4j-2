package ru.job4j.arrayTest;

/**
 * Check
 *
 * @author Mikhail Pushkarev
 * @since 20.02.2020
 * @version 9.0
 */

public class Check {
    /**
     * Method mono
     *
     * @param data - Принимает элементы массива.
     * @return - Возвращает результат.
     */
    public static boolean mono(boolean... data) {
        boolean b = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1]) {
                return false;
            }
        }
        return b;
    }
}
