package ru.job4j;

/**
 * Car
 * @author Mikhail Pushkarev
 * @since 05.03.2020
 * @version 0.16
 */
public class Car {
    private double value;

    /**
     * Method inDrive
     * @param cilometr - Принимает значение.
     */
    public void inDrive(int cilometr) {
        this.value = this.value - cilometr;
    }

    /**
     * Method fill
     * @param gas - Параметр принмает значение.
     */
    public void fill(int gas) {
        this.value = this.value + 10 * gas;
    }

    /**
     * Method canDrive
     * @return - Возвращает результат проверки значения.
     */
    public boolean canDrive() {
        boolean result = this.value > 0;
        return result;
    }

    /**
     * Method gasInfo
     */
    public void gasInfo() {
        System.out.println("I can drive " + this.value + " kilometrs");
    }
}
class CarUsege {
    /**
     * Main
     * @param args - Выводит результат на консоль.
     */
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
