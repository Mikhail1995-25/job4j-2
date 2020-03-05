package ru.job4j.condition;

/**
 * Max
 *
 * @author Mikhail Pushkarev
 * @since 05.03.2020
 * @version 0.4
 */
public class Max {
    /**
     * Method max - Выполнение тернарного условия.
     *
     * @param first - Принимает первое значение для выполнения условия.
     * @param second - Принимает второе условие для выполнения условия.
     * @return - Возвращает результат выполнения тернарного условия.
     */
    public static int max(int first, int second) {
        int i = first > second ? first : second;
        return i;
    }
}
