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

        for (int index = 0; index < array.length / 2; index++) {
            int temp = array[array.length - index - 1];
            array[array.length - index - 1] = array[index];
            array[index] = temp;
        }
        return array;
    }
}
