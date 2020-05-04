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
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                int point = i;
                while (point < array.length) {
                    if (array[point] != null) {
                        String temp = array[i];
                        array[i] = array[point];
                        array[point] = temp;
                        break;

                    }
                    point++;
                }

            }
            System.out.print(array[i] + " ");
        }
        return array;
    }
    public static void main(String[]args) {
        String[] strings = {"I", null, "wanna", null, "be", null, "compressed"};
        String[]compressed = compress(strings);
        System.out.println();
        for (int i = 0; i < compressed.length; i++) {
            System.out.print(compressed[i] + " ");

        }
    }
}
