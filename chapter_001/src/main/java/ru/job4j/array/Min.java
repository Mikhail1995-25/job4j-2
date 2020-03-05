package ru.job4j.array;

/**
 * Class Min
 * @author Mikhail Pushkarev
 * @since 23.02.2020
 * @version 12.0
 */

public class Min {
    /**
     * Method findMin - Ищет минимальный элемент в массиве.
     * @param array - Принимает элементы массива.
     * @return -  Возвращает минимальный элемент массива.
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
           if (array[i] < min) {
               min = array[i];
           }

        }
        return min;
    }

}
