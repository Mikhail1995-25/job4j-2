package ru.job4j.array;

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
        boolean result = true;
        for (int index = 0; index < data.length - 1; index++) {
            if (data[index] != data[index + 1]) {
                return false;
            }
        }
        return result;
    }
}
