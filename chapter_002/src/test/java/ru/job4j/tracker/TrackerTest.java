package ru.job4j.tracker;

import org.junit.Test;
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
    public void findbyname() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test1");
        Item item3 = new Item("test1");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);

        Item[] result =  tracker.findByName("test1");

        assertThat(result[3].getName(), is("test1"));

    }

    @Test
    public void findbyid() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);

        Item result =  tracker.findById(item1.getId());


        assertThat(result.getId(), is("test1"));

    }

    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        Item item4 = new Item("test4");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);

        assertThat(tracker.findByName("test1")[0].getName(), is("test1"));
    }

}

