package ru.job4j.ex;

/**
 * @author Mikhail Pushkarev
 * @version 14.04.2020
 * @since 0.1
 */
public class FactRec {

    public static int calc(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return calc(n - 1) * n;
        }
    }

    public static void main(String[] args) {
            int rs1 = calc(3);
            System.out.println(rs1);
    }
}
