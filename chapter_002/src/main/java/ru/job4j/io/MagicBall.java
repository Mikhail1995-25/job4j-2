package ru.job4j.io;
import java.util.Scanner;
import java.util.Random;
public class MagicBall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String name = scan.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.print(name + " да");
        } else {
            if (answer == 1) {
                System.out.print(name + " нет");
            } else {
                System.out.print(name + " Может быть");
            }
        }

    }
}
