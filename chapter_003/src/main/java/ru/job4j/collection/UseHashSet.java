package ru.job4j.collection;

import java.util.HashSet;

public class UseHashSet {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();
        names.add("Mikhail");
        names.add("Vasiliy");
        names.add("Vasiliy");
        names.add("Vlad");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
        HashSet<Integer> number = new HashSet<>();
        number.add(1);
        number.add(1);
        number.add(2);
        number.add(2);
        number.add(3);
        number.add(3);
        for (Integer num : number) {
            System.out.print(num);
        }
    }
}
