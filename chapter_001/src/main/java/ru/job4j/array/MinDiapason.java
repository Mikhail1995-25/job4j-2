package ru.job4j.array;

/**
 * Class MinDiapason
 *
 * @author Mikhail Pushkarev
 * @since 23. 02. 2020
 * @version 13.0
 */

public class MinDiapason {
    /**
     * Method findMin - Этот метод принимает массив элементов.
     * определенного диапазона, и определяет минимальный элемент в этом диапазоне.
     * @param array - Массив элементов.
     * @param start - Начальный элемент массива.
     * @param finish - Конечный элемент массива.
     * @return - Возвращает минимальный элемент дипазона.
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i < finish; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;
    }
}
