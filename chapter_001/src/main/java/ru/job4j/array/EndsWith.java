package ru.job4j.array;

/**
 * EndWith
 *
 * @author Mikhail Pushkarev
 * @since 21.02.2020
 * @version 10.0
 */
public class EndsWith {
    /**
     * Method endWith
     * @param word - Принимает символьный массив.
     * @param post - Принимает символьный массив.
     * @return - Возвращает сравнение заключительных символов.
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 0; index < post.length; index++) {
            if (post[post.length - index - 1] != word[word.length - index - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
