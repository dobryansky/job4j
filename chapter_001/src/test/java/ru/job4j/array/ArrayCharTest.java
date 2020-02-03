package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e', 'l', 'l'};
        boolean result =ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }

    @Test
    public void whenTrue() {
        char[] word = {'P', 'o', 't', 'a', 'o'};
        char[] pref = {'P', 'o'};
        boolean result =ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }
}
