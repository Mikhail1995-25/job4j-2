package ru.job4j.ex;

/**
 * @author Mikhail Pushkarev
 * @version 10.04.2020
 * @since 0.2
 */
public class Fact2 {


    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Параметр метода не корректен.");
        }
        int rs1 = 1;
        for (int index = 1; index <= n; index++) {
            rs1 += index;
        }
        return rs1;
    }
}
