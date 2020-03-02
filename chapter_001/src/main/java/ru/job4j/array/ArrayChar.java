package ru.job4j.array;

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
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (pref[index] == word[index]) {
                continue;
            }
            result = false;
            break;
        }
        return result;
    }
}
