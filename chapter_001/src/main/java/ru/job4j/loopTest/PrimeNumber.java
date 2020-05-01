package ru.job4j.loopTest;

/**
 * PrimeNumber
 *
 * @author Mikhail Pushkarev
 * @since 05.03.2020
 * @version 0.16
 */
public class PrimeNumber {
    /**
     * Method calc
     * @param finish - Принимает значение.
     * @return
     */
    public int calc(int finish) {
        int i = 0;
        for (int i1 = 2; i1 <= finish; i1++) {
            if (CheckPrimeNumber.check(i1)) {
                i++;
            }
        }
        return i;
    }
}
