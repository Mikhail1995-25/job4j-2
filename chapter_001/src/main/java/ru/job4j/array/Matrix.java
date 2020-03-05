package ru.job4j.array;

/**
 * Matrix
 * @author Mikhail Pushkarev
 * @since 25.02.2020
 * @version 15.0
 */

public class Matrix {
    /**
     * Method - Создает из двумерного массива таблицу умножения.
     * @param size - принимает значение в двумерный массив.
     * @return - Возвращает таблицу умножения.
     */
    public int[][] multiple(int size) {
        int[][] ints = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                ints[i][j] = (i + 1) * (j + 1);

            }
        }
        return ints;
    }
}
