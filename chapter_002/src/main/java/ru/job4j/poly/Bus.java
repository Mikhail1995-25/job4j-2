package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
        System.out.println("Автобус движется из Нижнего Новгорода в Москву.");
    }

    @Override
    public void passenger(int number) {
        int i = number;
        System.out.println(i + " пассажиров отправляются");
    }

    @Override
    public double fuel(double liters) {
         return liters * liters;
    }
}

