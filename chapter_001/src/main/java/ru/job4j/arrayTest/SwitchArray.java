package ru.job4j.arrayTest;

/**
 * SwitchArray
 *
 * @author Mikhail Pushkarev
 * @since 19.02.2020
 * @version 7.0
 */

public class SwitchArray {
    /**
     * Method swap - Сортирует элементы массива.
     * @param array - Массив значений.
     * @param source - Первая ячейка массива.
     * @param dest - Считать элементы массива с помощью length.
     * @return - Вернуть результат массива в хаотичном порядке.
     */
    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }
    /**
     * Method swapBorder - Выполняет перестановку значения.
     * @param array - Принимает индекс массива.
     * @return - Возвращает результат перестановки значения в массиве.
     */
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    /**
     * Main
     * @param args - Выводит результат на консоль.
     */
    public static void main(String[]args) {
        int[] ints = new int[] {1, 2, 3, 4, 5, 6};
        int[] rs1 = swapBorder(ints);
        for (int i = 0; i < rs1.length; i++) {
            System.out.println(rs1[i]);
        }
    }
}
