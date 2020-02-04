package ru.job4j.condition;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void when2bigger1() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }


    @Test
    public void when1bigger2() {
        int result = Max.max(6, 5);
        assertThat(result, is(6));
    }

    @Test
    public void when1equal2() {
        int result = Max.max(3, 3);
        assertThat(result, is(3));
    }

}