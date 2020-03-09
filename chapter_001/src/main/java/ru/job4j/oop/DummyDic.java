package ru.job4j.oop;

/**
 * DummyDic
 *
 * @author Mikhail Pushkarev
 * @since 09.03.2020
 * @version 1.4
 */
public class DummyDic {
    /**
     * Method engToRus
     *
     * @param eng - Принимает строку.
     * @return - Возвращает результат метода.
     */
    public String engToRus(String eng) {
        String s = "Неизвестное слово - " + eng;
        return s;
    }
    /**
     * Main
     *
     * @param args - Выводит строку на консоль.
     */
    public static void main(String[] args) {
        DummyDic dummy = new DummyDic();
        String str = dummy.engToRus("Привет");
        System.out.println(str);
    }
}
