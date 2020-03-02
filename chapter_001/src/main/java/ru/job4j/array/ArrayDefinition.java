
package ru.job4j.array;

/**
 * ArrayDefinition
 *
 * @author Mikhail Pushkarev
 * @since 17.02.2020
 * @version 3.0
 */

public class ArrayDefinition {
    /**
     * Main
     * @param args - Создание  переменных.
     */
    public static void main(String... args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];

        names[0] = "Mikhail";
        names[1] = "Roman";
        names[2] = "Aleksandr";
        names[3] = "Olga";
        String name = names[0];
        System.out.println(name);
        String name1 = names[1];
        System.out.println(name1);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}

