package ru.job4j.arrayTest;

/**
 * BarleyBreak
 * @author Mikhail Pushkarev
 * @since 25.02.2020
 * @version 14.0
 */

public class BarleyBreak {
    /**
     * Main
     * @param args - Выводит результат кода в консоль.
     */
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int i1 = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = i1;
                i1++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

}
