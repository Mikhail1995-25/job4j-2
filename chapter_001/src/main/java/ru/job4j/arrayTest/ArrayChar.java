package ru.job4j.arrayTest;

/**
 * ArrayChar
 *
 * @author Mikhail Pushkarev
 * @since 21.02.2020
 * @version 9.0
 */

public class ArrayChar {
    /**
     * Method startWith
     * @param word - Символьный массив.
     * @param pref - Символьный массив.
     * @return - Результат сравнения символов.
     */
    public static boolean startWith(char[] word, char... pref) {
        boolean b = true;
        for (int i = 0; i < pref.length; i++) {
            if (pref[i] == word[i]) {
                continue;
            }
            b = false;
            break;
        }
        return b;
    }
}
