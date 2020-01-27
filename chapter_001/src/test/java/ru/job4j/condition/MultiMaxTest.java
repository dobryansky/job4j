package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(7, 4, 3);
        assertThat(result, is(7));
    }


    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(11, 12, 25);
        assertThat(result, is(25));
    }

    @Test
    public void whenAllEqual() {
        MultiMax check = new MultiMax();
        int result = check.max(11, 11, 11);
        assertThat(result, is(11));
    }

}