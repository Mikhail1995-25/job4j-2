package ru.job4j.poly;

public class BusTest {
    public static void main(String[] args) {
        Bus b = new Bus();
        b.go();
        b.passenger(25);
        System.out.println(b.fuel(70.0) + " рублей");
    }
}
