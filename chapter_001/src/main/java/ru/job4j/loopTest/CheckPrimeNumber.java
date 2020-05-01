package ru.job4j.loopTest;

/**
 * CheckPrimeNumber
 * @author Mikhail Pushkarev
 * @since 05.03.2020
 * @version 0.12
 */
public class CheckPrimeNumber {
    /**
     * Method check - Проверяет значение на четность.
     * @param number - Принимает значение.
     * @return - Выводит результат проверки.
     */
    public static boolean check(int number) {
        boolean prime = true;
        for (int index = 2; index < number; index++) {
            if (number % index == 0) {
               prime = false;
                break;

            }
        }
        return prime;
    }
}
