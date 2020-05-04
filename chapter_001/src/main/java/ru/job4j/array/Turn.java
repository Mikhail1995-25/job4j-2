package ru.job4j.array;

/**
 * Turn
 *
 * @author Mikhail Pushkarev
 * @since 20.02.2020
 * @version 8.0
 */

public class Turn {
    /**
     * Method back.
     * @param array - Принимает элементы массива.
     * @return - Возвращает в перевернутом порядке элементы массива.
     */
    public static int[] back(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
