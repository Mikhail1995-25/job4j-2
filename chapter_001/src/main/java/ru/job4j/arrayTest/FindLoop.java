package ru.job4j.arrayTest;

/**
 * FindLoop
 *
 * @author Mikhail Pushkarev
 * @since 18.02.2020
 * @version 5.0
 */

public class FindLoop {
    /**
     * Method indexOf - Ищет элемент массива.
     * @param data - Принимает массив значений.
     * @param el - Принимает установленное значение.
     * @return - Возвращает результат метода.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i < finish; i++) {
            if (data[i] == el) {
                rst = i;
            }
        }
        return rst;
    }
}
