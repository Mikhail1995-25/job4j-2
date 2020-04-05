package ru.job4j.stragery;
/**
 * @author Mikhail Pushkarev
 * @version 05.04.2020
 * @since 0.1
 */

import java.util.StringJoiner;

public class Square implements Shape {
    @Override
    public String draw() {
        StringJoiner pic = new StringJoiner(System.lineSeparator());
        pic.add("++++++");
        pic.add("+    +");
        pic.add("+    +");
        pic.add("++++++");
        return pic.toString();
    }
}
