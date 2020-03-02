package ru.job4j;

public class Car {
    private double value;

    public void inDrive(int cilometr) {
        this.value = this.value - cilometr;
    }
    public void fill(int gas) {
        this.value = this.value + 10 * gas;
    }
    public boolean canDrive() {
        boolean result = this.value > 0;
        return result;
    }
    public void gasInfo() {
        System.out.println("I can drive " + this.value + " kilometrs");
    }
}
class CarUsege {
    public static void main(String[]args) {
        Car audi = new Car();
        boolean driving = audi.canDrive();
        System.out.println("Can you drive " + driving);
        System.out.println("I am going to a gas station");
        int gas = 25;
        audi.fill(gas);
        driving = audi.canDrive();
        System.out.println("Can you drive now " + driving);
        int distance = 10;
        audi.inDrive(distance);
        audi.gasInfo();
    }
}
