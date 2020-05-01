package ru.job4j.arrayTest;

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
        int[] ints = new int[] {5, 3, 2, 1, 4};
        int temp = ints[0];
         ints[0] = ints[3];
         ints[3]  = temp;
         temp = ints[1];
         ints[1] = ints[2];
         ints[2] = temp;
         temp = ints[4];
         ints[4] = ints[3];
         ints[3] = temp;

        for (int i : ints) {
            System.out.println(i);
        }
    }
}
