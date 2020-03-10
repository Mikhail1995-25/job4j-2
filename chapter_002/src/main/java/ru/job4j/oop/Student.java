package ru.job4j.oop;

/**
 * Student
 * @author Mikhail Pushkarev
 * @since 09.03.2020
 * @version 0.3
 */
public class Student {
    /**
     * Method music - Студент Петя играет на баяне.
     */
    public void music() {
        System.out.println("Tra tra tra");
    }

    /**
     * Method song - Петя поет песню.
     */
    public void song() {
        System.out.println("I believe I can fly");
    }

    /**
     * Main
     * @param args - Вывести на конслоь результат.
     */
    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();

    }
}
