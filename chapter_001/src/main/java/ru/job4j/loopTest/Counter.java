package ru.job4j.loopTest;

/**
 * Counter
 *
 * @author Mikhail Pushkarev
 * @since 05.03.2020
 * @version 0.13
 */
public class Counter {
    /**
     * Method sum - Диапозон значений.
     * @param start - Начальное значение.
     * @param finish - Конечное значение.
     * @return - Возвращает результат.
     */
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    /**
     * Method sumByEvent - Найти четное значение в диапозоне.
     * @param start - Начальное значение.
     * @param finish - Конечное значение.
     * @return Возвращает результат.
     */
    public static int sumByEvent(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    /**
     * Main
     * @param args - Выводит на консоль результат.
     */
    public static void main(String[]args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
    }
}
