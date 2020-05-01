package ru.job4j.arrayTest;

/**
 * Square
 * @author Mikhail Pushkarev
 * @since 17.02.2020
 * @version 0.4
 */

public class Square {
    /**
     * Method calculate.
     * @param bound - значение массива.
     * @return rst - Возвращает числа в квадрате.
     */
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = i * i;
        }
        return rst;
    }

    /**
     * Main
     * @param args - вывод результата в консоль.
     */
    public static void main(String[]args) {
        int[] array = calculate(4);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        int[] array1 = calculate(5);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
}
