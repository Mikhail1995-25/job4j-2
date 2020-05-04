package ru.job4j.loop;

/**
 * Fitness
 * @author Mikhail Pushkarev
 * @since 05.03.2020
 * @version 0.15
 */
public class Fitness {
    /**
     * Method calc - Нужно узнать за какой срок Иван и Николай возьмут больший вес.
     * @param ivan - Результат Ивана.
     * @param nik - Результат Николая.
     * @return
     */
    public static int calc(int ivan, int nik) {
        int month = 0;
       while (ivan < nik) {
           ivan *= 3;
           nik *= 2;
           month++;
       }
        return month;
    }
}
