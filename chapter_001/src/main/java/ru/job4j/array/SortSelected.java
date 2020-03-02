package ru.job4j.array;

/**
 * Class SortSelected
 *
 * @author Mikhail Pushkarev
 * @since 24.02.2020
 * @version 14.0
 */
public class SortSelected {
    /**
     * Method sort - Метод сортирует значения в массиве по возрастанию.
     * @param data - Принимает массив.
     * @return - Возвращает упорядоченный массив.
     */

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length);
            int index = FindLoop.indexOf(data, min, i, data.length);
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }
        return data;
    }
}
