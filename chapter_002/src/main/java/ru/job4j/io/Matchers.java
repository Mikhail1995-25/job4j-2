package ru.job4j.io;
import java.util.Scanner;
public class Matchers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int answer = 11;
        boolean run = true;
        while (run) {
            System.out.println("Игра 11");
            int first = Integer.valueOf(scan.nextLine());
            answer -= first;
            System.out.println("Первый игрок");
            System.out.println("Осталось " + answer);
            if(answer < 0) {
                System.out.println("Выиграл первый игрок");
                run = false;
            }
            int second = Integer.valueOf(scan.nextLine());
            answer -= second;
            System.out.println("Второй игрок");
            System.out.println("Осталось " + answer);
            if (answer < 0) {
                System.out.println("Выиграл второй игрок " );
                run = false;
            }
        }
    }
}

