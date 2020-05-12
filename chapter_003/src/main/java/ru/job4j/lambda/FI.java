package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FI {
    public static void main(String[] args) {
        Attachment[] ats = {
                new Attachment("image 1", 20),
                new Attachment("image 2", 120),
                new Attachment("image 3", 24)
        };
        Comparator<Attachment> comparator = (left, right) -> left.getSize() - right.getSize();
        Arrays.sort(ats, comparator);

        String[] num = {
                "mi",
                "kh",
                "ail"
        };

        Comparator<String> name = (left, right) -> left.compareTo(right);
        Arrays.sort(num, name);
        for (String n : num) {
            System.out.println(n);
        }
        System.out.println();
        Comparator<String> comparator1 = (left, right) -> left.length() - right.length();
        Arrays.sort(num, comparator1);
        for (String n : num) {
            System.out.println(n);
        }
        System.out.println();
        Comparator<String> comparator2 = (left, right) -> right.length() - left.length();
        Arrays.sort(num, comparator2);
        for (String n : num) {
            System.out.println(n);
        }
    }
}
