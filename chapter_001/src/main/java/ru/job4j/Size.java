package ru.job4j;

/**
 * Size
 * @author Mikhail Pushkarev
 * @since 05.03.2020
 * @version 0.20
 */
public class Size {
    /**
     * Method add
     * @param right - Принимает значение.
     * @param left - Принмает второе значение.
     * @return - Возвращает результат сложения.
     */
    public static int add(int right, int left) {
        int i = right + left;
        return i;
    }

    /**
     * Method info
     * @param size - Принимает значение.
     */
    public void info(int size) {
        System.out.println("Your size is: " + size);
    }

    /**
     * Main
     * @param args - Выводит результат на консоль.
     */
    public static void main(String[]args) {
        Size size = new Size();
        int nike = 10;
        int puma = 20;
        int i = size.add(nike, puma);
        size.info(i);
    }
}
