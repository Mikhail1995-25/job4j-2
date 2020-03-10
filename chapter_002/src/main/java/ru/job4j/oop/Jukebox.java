package ru.job4j.oop;

/**
 * Jukebox
 * @author Mikhail Pushkarev
 * @since 09.03.2020
 * @version 1.3
 */
public class Jukebox {
    /**
     * Method music
     * @param position - Принимает значение для выбора позиции песни.
     */
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    /**
     * Main
     * @param args - Выводит результат на консоль.
     */
    public static void main(String[] args) {
        Jukebox petya = new Jukebox();
        petya.music(1);
        petya.music(2);
        petya.music(10);
    }
}
