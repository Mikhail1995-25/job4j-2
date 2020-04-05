package ru.job4j.stragery;
import java.util.StringJoiner;

/**
 * @author Mikhail Pushkarev
 * @version 05.04.2020
 * @since 0.1
 */
public class Triangle implements Shape {

    @Override
    public String draw() {
        StringJoiner tri = new StringJoiner(System.lineSeparator());
        tri.add("   +   ");
        tri.add("  + +  ");
        tri.add(" +   + ");
        tri.add("+++++++");
        return tri.toString();
    }
}
