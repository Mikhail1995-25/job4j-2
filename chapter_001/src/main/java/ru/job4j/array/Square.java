package ru.job4j.array;

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
        for (int index = 0; index < bound; index++) {
            rst[index] = index * index;
        }
        return rst;
    }

    /**
     * Main
     * @param args - вывод результата в консоль.
     */
    public static void main(String[]args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
        System.out.println();
        int[] array1 = calculate(5);
        for (int index = 0; index < array1.length; index++) {
            System.out.println(array1[index]);
        }
    }
}
