package ru.job4j.condition;

import static org.junit.Assert.assertThat;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class SqMaxTest  {
    @Test
    public void square() {
        int first = 7;
        int second = 8;
        int third = 7;
        int forth = 14;


        int expected = SqMax.max(first,second,third,forth);
         assertThat(expected, is(14));
    }
}