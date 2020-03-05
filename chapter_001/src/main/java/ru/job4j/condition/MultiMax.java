package ru.job4j.condition;

/**
 * MultiMax
 *
 * @author Mikhail Pushkarev
 * @since 05.03.2020
 * @version 0.5
 */
public class MultiMax {
    /**
     * Method max - Выполнение тернарного условия из трех параметров.
     * @param first - Первое значение.
     * @param second - Второе значение.
     * @param third - Третье значение.
     * @return - Возвращает результат выполнения тернарного условия.
     */
    public static int max(int first, int second, int third) {
        int i = first > second ? first : second > third ? second : third;
        return i;
    }
}
