package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionCount {

    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> dip = new ArrayList();
        for (int i = start; i < end; i++) {
            dip.add(func.apply((double) i));
        }
        return dip;
    }
}
