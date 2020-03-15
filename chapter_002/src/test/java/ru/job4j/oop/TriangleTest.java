package ru.job4j.oop;
import  org.junit.Test;
import ru.job4j.condition.Point;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class TriangleTest {
    @Test
    public void whenExist() {
        Point first = new Point(2, 2);
        Point second = new Point(4, 4);
        Point thirst = new Point(1, 6);
        Triangle triangle = new Triangle(first, second, thirst);
        double result = triangle.area();
        assertThat(result, is(5.000000000000003));
    }
    @Test
    public void whenExist2() {
        Point first = new Point(10, 10);
        Point second = new Point(20, 20);
        Point third = new Point(10, 20);
        Triangle triangle = new Triangle(first, second, third);
        double result = triangle.area();
        assertThat(result, is(50.0));
    }
}
