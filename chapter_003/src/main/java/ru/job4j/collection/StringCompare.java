package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
       int res = first.length() - second.length();
       for (int i = 0; i < first.length(); i++) {
           if (first.charAt(i) != second.charAt(i)) {
               res = first.charAt(i) - second.charAt(i);
               break;
           }
       }

        return res;
    }


}
