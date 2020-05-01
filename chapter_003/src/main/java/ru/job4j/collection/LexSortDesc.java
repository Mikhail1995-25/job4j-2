package ru.job4j.collection;

import java.util.Comparator;

public class LexSortDesc implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        if (right.length()  > left.length()) {
            return 1;
        } else if (right.length() < left.length()) {
            return -1;
        }
        return right.compareTo(left);
    }
}
