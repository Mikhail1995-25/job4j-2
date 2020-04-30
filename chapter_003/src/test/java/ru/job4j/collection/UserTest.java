package ru.job4j.collection;
import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class UserTest {

    @Test
    public void whenAsc() {
        Set<User> user = new TreeSet<>();
        user.add(new User("Mikhail", 24));
        user.add(new User("Vlad", 20));
        Iterator<User> it = user.iterator();
        assertThat(it.next(), is(new User("Vlad", 20)));
        assertThat(it.next(), is(new User("Mikhail", 24)));
    }

    @Test
    public void whenCompareMikhailVsVlad() {
        int rs1 = new User("Mikhail", 24)
                .compareTo(
                        new User("Vlad", 20)
                );
        assertThat(rs1, greaterThan(0));
    }
}
