
package ru.job4j.arrayTest;

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
        String[] strings = new String[100500];
        float[] floats = new float[40];
        String[] strings1 = new String[4];

        strings1[0] = "Mikhail";
        strings1[1] = "Roman";
        strings1[2] = "Aleksandr";
        strings1[3] = "Olga";
        String name = strings1[0];
        System.out.println(name);
        String name1 = strings1[1];
        System.out.println(name1);
        System.out.println(strings1[2]);
        System.out.println(strings1[3]);
    }
}

