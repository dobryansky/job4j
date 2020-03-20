
package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IndexofTest {
    @Test
    public void Index0() throws ElementNotFoundException {
        String[] array = {"qewqw", "qweqw", "ewr", "tryhr", "sbd", "dmtnm", "vaewrv", "tdymn", "gaerg", "fcaw", "cwcf"};
        FindEl findEl = new FindEl();

        int expected = findEl.indexOf(array, "tryhr");
        assertThat(expected, is(3));

    }

    @Test
    public void IndexLast() throws ElementNotFoundException {
        String[] array = {"qewqw", "efvca", "ewr", "tryhr", "sbd", "dmtnm", "vaewrv", "tdymn", "gaerg", "fcaw", "cwcf"};
        FindEl findEl = new FindEl();

        int expected = findEl.indexOf(array, "cwcf");
        assertThat(expected, is(10));

    }

    @Test(expected = ElementNotFoundException.class)
    public void IndexNO() throws ElementNotFoundException {
        String[] array = {"qewqw", "qweqw", "ewr", "tryhr", "sbd", "dmtnm", "vaewrv", "tdymn", "gaerg", "fcaw", "cwcf"};
        FindEl findEl = new FindEl();

        findEl.indexOf(array, "try69hr");


    }

}

