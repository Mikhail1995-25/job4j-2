package ru.job4j.tracker;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenAdd3NewItemsThenTrackerHasSameItems() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        List<Item> result = tracker.findAll();
        assertThat(result.get(0).getName(), is(item1.getName()));
        assertThat(result.get(1).getName(), is(item2.getName()));
        assertThat(result.get(2).getName(), is(item3.getName()));
    }


    @Test
    public void whenAddNewItemsOneOfWhichWithId44ThenTrackerHasFindThisItemById() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item result = tracker.findById(item3.getId());
        assertThat(result.getId(), is(item3.getId()));
    }
}