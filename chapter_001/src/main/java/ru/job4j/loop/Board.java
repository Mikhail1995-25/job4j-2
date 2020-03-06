package ru.job4j.loop;

/**
 * Board
 *
 * @author Mikhail Pushkarev
 * @since 05.03.2020
 * @version 0.11
 */
public class Board {
    /**
     * Method paint - Вывод  с помощью деления по модулю.
     * @param width - Первое значение.
     * @param height - Второе значение.
     */
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
               if ((row + cell) % 2 == 0) {
                   System.out.print("X");
               } else {
                   System.out.print(" ");
               }
               }
                System.out.println();

        }
    }

    /**
     * Main
     * @param args - Выводит результат на консоль.
     */
    public static void main(String[]args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}