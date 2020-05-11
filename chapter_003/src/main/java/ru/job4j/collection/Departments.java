package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> rs1 = new TreeSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                rs1.add(start + el);
                start = start + el + "/";
            }
        }
        return new ArrayList<>(rs1);
    }

    public static void sortAsc(List<String> orgs) {
       orgs.sort(Comparator.naturalOrder());

    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }
}
