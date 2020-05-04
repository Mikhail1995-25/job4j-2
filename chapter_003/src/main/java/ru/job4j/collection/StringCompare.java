package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
        int res = 0;
        for (int index = 0;  index < Math.min(first.length(), second.length()); index++) {
            res = Character.compare(first.charAt(index), second.charAt(index));
            if (res != 0) {
                break;
            }
        }
        return res == 0 ? Integer.compare(first.length(), second.length()) : res;
    }
}
