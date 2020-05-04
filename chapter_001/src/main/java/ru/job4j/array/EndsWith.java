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
        boolean b = true;
        for (int i = 0; i < post.length; i++) {
            if (post[post.length - i - 1] != word[word.length - i - 1]) {
                b = false;
                break;
            }
        }
        return b;
    }
}
