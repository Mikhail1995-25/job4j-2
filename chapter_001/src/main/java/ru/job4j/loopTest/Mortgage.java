package ru.job4j.loopTest;
/**
 * Mortgage
 *
 * @author Mikhail Pushkarev
 * @since 05.03.2020
 * @version 0.15
 */
public class Mortgage {
    /**
     * Method year
     * @param amount - Принмает первое значение.
     * @param salary - Принмает второе значение.
     * @param percent - Принимает третье значение.
     * @return
     */
    public int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount >= 0) {
       amount += amount  * (percent / 100) - salary;
       year++;
        }
        return year;
    }
}
