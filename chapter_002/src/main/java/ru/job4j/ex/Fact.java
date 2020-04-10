package ru.job4j.ex;

/**
 * @author Mikhail Pushkarev
 * @version 10.04.2020
 * @since 0.1
 */
public class Fact {
    public static void main(String[] args) {
        System.out.println(calc(-2));
    }
    public static int calc(int n) {
        int rs1 = 1;
        if (n < 0) {
            throw new IllegalArgumentException("Параметр метода не корректен");
        }
        for (int index = 1; index <= n; index++) {
            rs1 *= index;
        }
        return rs1;
    }
}
