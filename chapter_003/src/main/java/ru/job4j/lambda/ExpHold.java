package ru.job4j.lambda;

import java.util.Arrays;
import java.util.List;





public class ExpHold<T> implements Wrapper<T> {
    private T value;

    @Override
    public T get() {
        return this.value;
    }

    @Override
    public void set(T value) {
        this.value = value;
    }

    @Override
    public boolean isEmpty() {
        return this.value == null;
    }
    public static void badMethod() throws Exception {

    }


public static void main(String[] args) {
    List<String> names = Arrays.asList("Petr", "Nick", "Ban");
    Wrapper<Exception> ex = new ExpHold<>();
    names.forEach(
            n -> {
                try {
                    badMethod();
                } catch (Exception e) {
                    ex.set(e);
                }
            }
    );
    if (!ex.isEmpty()) {
        try {
            throw ex.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
}