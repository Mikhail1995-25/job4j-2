package ru.job4j.collection;
import org.junit.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class StringCompareTest {

    @Test
    public void whenStringsAreEqualsThenZero() {
        StringCompare compare = new StringCompare();
        int rs1 = compare.compare(
                "Ivanov",
                "Ivanov"
        );
        assertThat(rs1, is(0));
    }

    @Test
    public void whenLeftLessThenRightResultShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rs1 = compare.compare(
                "Ivanov",
                "Ivanova"
        );
        assertThat(rs1, lessThan(0));
    }

    @Test
    public void whenSecondCharOfLeftGreaterThenRightShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rs1 = compare.compare(
                "Petrov",
                "Patrov"
        );
        assertThat(rs1, greaterThan(0));
    }

    @Test
    public void whenSecondCharOfLeftLessThanRightShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rs1 = compare.compare(
                "Patrova",
                "Petrov"
        );
        assertThat(rs1, lessThan(0));
    }

    @Test
    public void whenSecondCharOfLeftLessThanRightResultNegative() {
        StringCompare compare = new StringCompare();
        int rs1 = compare.compare(
                "Petrov",
                 "etrov"
        );
        assertThat(rs1, lessThan(0));
    }

    @Test
    public void whenFirstCarOfLeftGreaterThanNegative() {
        StringCompare compare = new StringCompare();
        int rs1 = compare.compare(
                "Ivanov",
                "Petrov"
        );
        assertThat(rs1, lessThan(0));
    }
}
