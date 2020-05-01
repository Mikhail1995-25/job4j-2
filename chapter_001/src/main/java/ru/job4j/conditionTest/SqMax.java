package ru.job4j.conditionTest;

/**
 * SqMax
 *
 * @author Mikhail Pushkarev
 * @since 05.03.2020
 * @version 0.7
 */
public class SqMax {
    /**
     * Method max - В этом методе нужно было исправить ошибку с помощью Debug.
     * @param first - Первое значение.
     * @param second - Второе значение.
     * @param third - Третье значение.
     * @param forth - Четвертое значение.
     * @return - Возвращает Результат работы метода.
     */
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if (first > second) {
            if (first > third) {
                if (first > forth) {
                    result = first;
                }
            } else if (third > first) {
                result = third;
            }
        } else if (second > third) {
            if (second > forth) {
                result = second;
            }
        } else if (third > forth) {
            result = third;
        }
        return result;
    }
}
