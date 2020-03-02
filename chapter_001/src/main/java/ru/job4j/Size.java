package ru.job4j;

public class Size {
    public static int add(int right, int left) {
        int result = right + left;
        return result;
    }
    public void info(int size) {
        System.out.println("Your size is: " + size);
    }
    public static void main(String[]args) {
        Size size = new Size();
        int nike = 10;
        int puma = 20;
        int result = size.add(nike, puma);
        size.info(result);

    }
}
