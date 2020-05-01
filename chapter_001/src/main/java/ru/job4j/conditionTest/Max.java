package ru.job4j.conditionTest;

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

    /**
     * Перегруженный метод из трех чисел.
     * @param first принимает первое число.
     * @param second принимает второе число.
     * @param third принимает третье чтсло.
     * @return возвращает результата выполнения тернарного оператора.
     */
    public static int max(int first, int second, int third) {
        return max(first,
        max(second, third)
        );
    }

    /**
     * Перегрузка метода с четыремя числами.
     * @param first - примает первое число.
     * @param second - принимает второе число.
     * @param third - принимает третье число.
     * @param fourth - принимает четвертое число.
     * @return - Возвратить результат выполнения тернарного условия.
     */
    public static int max(int first, int second, int third, int fourth) {
        return max(first,
                max(second, third, fourth)
        );
    }
}
