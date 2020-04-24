package ru.job4j.io;
import java.util.Scanner;
public class Matchers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      boolean run = true;
      int answer = 11;
      while (run) {
          System.out.println("Игра 11");
          System.out.println("В этой игре учавствуют два игрока, им нужно брать спички со стола от 1 - 3 штук " + " кто последний вытащит тот победитель.");
          System.out.println("Начать: ");
          int select = Integer.valueOf(scan.nextLine());
          if (select > 0 && select < 4) {
              answer -= select;
              System.out.println("Осталось " + answer + " спичек");
          } else {
              System.out.println("Вы ввели не то число");
          }
          if (answer % 2 == 0) {
              System.out.println("Первый игрок взял");
          } else {
              System.out.println("Второй игрок взял");
          }
          if (answer == 0) {
              System.out.println("Первый игрок победил");
              run = false;
              } else if (answer < 0) {
              System.out.println("Второй игрок победил");
              run = false;
          }

      }
    }


}

