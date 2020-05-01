package ru.job4j.calculatorTest;

/**
 * MathFunc
 *
 * @author Mikhail Pushkarev
 * @since 05.03.2020
 * @version 0.3
 */
public class MathFunc {
    /**
     * Method func1
     *
     * @param x - Принимает значение для вычесления суммы.
     * @return - Возвращает результат вычесления.
     */
    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    /**
     * Main
     * @param args - Выводит вычесленный результат на консоль.
     */
    public static void main(String[]args) {
        int result = func1(100);
        System.out.println(result);
    }
}
