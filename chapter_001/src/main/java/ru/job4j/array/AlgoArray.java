package ru.job4j.array;

/**
 * AlgoArray
 *
 * @author Mikhail Pushkarev
 * @since 18.02.2020
 * @version 6.0
 *
 */

public class AlgoArray {
    /**
     * Main - Сортирует индексы массива по порядку.
     * @param args - Выводит результат на консоль.
     */
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0];
         array[0] = array[3];
         array[3]  = temp;
         temp = array[1];
         array[1] = array[2];
         array[2] = temp;
         temp = array[4];
         array[4] = array[3];
         array[3] = temp;

        for (int i : array) {
            System.out.println(i);
        }
    }
}
