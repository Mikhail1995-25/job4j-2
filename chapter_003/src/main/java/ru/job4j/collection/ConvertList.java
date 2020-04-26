package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {

    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rs1 = new ArrayList<>();
        for (int[] row : list) {
            for (int cell :row) {
                rs1.add(cell);
            }
        }
        return rs1;
    }
    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();
        list.add(new int[] {1, 2});
        list.add(new int[] {3, 4});
        list.add(new int[] {5, 6});
        for (int[] row : list) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
        }
    }
}
