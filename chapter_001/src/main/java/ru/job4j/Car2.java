package ru.job4j;

public class Car2 {
    private double value;

    public void inDrive(int kilometr) {
       this.value = this.value - kilometr;
    }
    public void res(int gas) {
        this.value = this.value + 10 * gas;
    }
    public boolean onDrive() {
        boolean result = this.value > 0;
        return result;
    }
    public void inGas() {
        System.out.println("Value " + this.value + " kilometrs");
    }
}
class Driving {
    public static void main(String[]args) {
        Car2 bmw = new Car2();
        boolean bool = bmw.onDrive();
        System.out.println("Result " + bool);
        int gas = 30;
        bmw.res(gas);
        bool = bmw.onDrive();
        System.out.println("Result now " + bool);
        int kil = 20;
        bmw.inDrive(kil);
        bmw.inGas();
    }
}
