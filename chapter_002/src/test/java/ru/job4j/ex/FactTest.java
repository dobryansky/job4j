package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void Fact0() {
        Fact.calc(0);

    }

    @Test
    public void Fact5() {
        int expected=Fact.calc(5);
        assertThat(expected, is(120));

    }

}