package ru.job4j.tracker;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ItemTest {

    @Test
    public void whenItemAscending() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("a");
        Item item3 = new Item("c");
        Item item2 = new Item("b");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.sortNameAscending();
        List<Item> list = tracker.findAll();
        assertThat(list.get(0).getName(), is(item1.getName()));
        assertThat(list.get(1).getName(), is(item2.getName()));
        assertThat(list.get(2).getName(), is(item3.getName()));
    }

    @Test
    public void whenItemDescending() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("a");
        Item item2 = new Item("c");
        Item item3 = new Item("b");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.sortNameDescending();
        List<Item> list = tracker.findAll();
        assertThat(list.get(0).getName(), is(item2.getName()));
        assertThat(list.get(1).getName(), is(item3.getName()));
        assertThat(list.get(2).getName(), is(item1.getName()));

    }
}
