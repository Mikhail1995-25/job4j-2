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
        for (int index = 0; index < array.length; index++) {
           if (array[index] < min) {
               min = array[index];
           }

        }
        return min;
    }

}
