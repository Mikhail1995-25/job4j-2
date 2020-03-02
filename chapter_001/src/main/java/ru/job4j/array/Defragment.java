package ru.job4j.array;

/**
 * Defragment
 * @author Mikhail Pushkarev
 * @since 28.02.2020
 * @version 16.0
 */

public class Defragment {
    /**
     * Method compress - Метод должен отсортировать массив.
     * @param array - Принимает массив строк с пустыми ячейками.
     * @return - Возвращает отсортированный массив
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                while (point < array.length) {
                    if (array[point] != null) {
                        String temp = array[index];
                        array[index] = array[point];
                        array[point] = temp;
                        break;

                    }
                    point++;
                }

            }
            System.out.print(array[index] + " ");
        }
        return array;
    }
    public static void main(String[]args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[]compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");

        }
    }
}
