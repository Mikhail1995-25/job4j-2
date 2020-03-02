package ru.job4j.calculator;

public class Fit {

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
        System.out.println("Man 100 is " + man);
        double woman = womanWeight(170);
        System.out.println("Woman 110 is " + woman);

    }
}
