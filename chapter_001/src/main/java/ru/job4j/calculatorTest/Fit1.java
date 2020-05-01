package ru.job4j.calculatorTest;

public class Fit1 {
    public static double manWeight(double height) {
        double weight = (height - 100) * 1.15;
        return weight;
    }
    public static double womanWeight(double height) {
        double weight = (height - 110) * 1.15;
        return weight;
    }
    public static void main(String[]args) {
        double man = manWeight(174);
        System.out.println("Man 174 is " + man);
        double woman = womanWeight(160);
        System.out.println("Woman 160 is " + woman);

    }
}
