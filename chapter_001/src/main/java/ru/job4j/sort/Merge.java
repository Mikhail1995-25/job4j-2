package ru.job4j.sort;

import java.util.Arrays;

/**
 * Merge
 * @author Mikhail Pushkarev
 * @since 02.03.2020
 * @version 18.0
 */

public class Merge {
    /**
     * Method merge
     * @param left - Массив значений.
     * @param right - Массив значений.
     * @return - Возвращает массив слияний, упорядоченный.
     */
    public int[] merge(int[] left, int[] right) {
        int[] rs1 = new int[left.length + right.length];
        int l = 0;
        int r = 0;
        int i = 0;
        while(i < rs1.length){
            if(l > left.length - 1) {
                rs1[i] = right[r];
                r++;
            } else if(r > right.length -1) {
                rs1[i] = left[l];
                l++;
            } else if (left[l] < right[r]) {
                rs1[i] = left[l];
                l++;
            } else {
                rs1[i] = right[r];
                r++;
            }
            i++;
        }
           return rs1;
    }
    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rs1 =  process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rs1));
    }
}
