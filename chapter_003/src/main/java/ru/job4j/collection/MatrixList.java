package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MatrixList {

    public static List<Integer> number(Integer[][] put) {
        return Arrays.stream(put).flatMap(Arrays::stream).collect(Collectors.toList());
    }

    public static List<Integer> matrixAtList(List<List<Integer>> add) {
        return add.stream().flatMap(Collection::stream).collect(Collectors.toList());
    }
    public static void main(String[] args) {
       Integer[][] num = {
               {1, 2},
               {3, 4},
               {5, 6}
       };

       List<Integer> list = Arrays.stream(num)
               .flatMap(Arrays::stream).collect(Collectors.toList());
       System.out.println(list);
    }
}
