package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String first, String second) {
        String[] left = first.split("/");
        String[] right = second.split("/");
        int i = right[0].compareTo(left[0]);
        return i == 0 ? first.compareTo(second) : i;
    }
}
