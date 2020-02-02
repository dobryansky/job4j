package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort1() {
        int[] input = new int[] {5, 13, 10, 24, 19};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {5, 10, 13, 19, 24};
        assertThat(result, is(expect));
    }



    @Test
    public void whenSort2 () {
        int[] input = new int[] {32, 16, 8, 4, 2};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {2, 4, 8, 16, 32};
        assertThat(result, is(expect));
    }


    @Test
    public void whenSort5 () {
        int[] input = new int[] {32, 16, 8, 4, 23, 54, 31, 45, 17};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {4, 8, 16, 17, 23,31,32,45,54};
        assertThat(result, is(expect));
    }


}
