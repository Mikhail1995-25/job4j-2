package ru.job4j.array;

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
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index < finish; index++) {
            if (data[index] == el) {
                rst = index;
            }
        }
        return rst;
    }
}
