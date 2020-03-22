package ru.job4j.sort;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MachineTest {
    @Test
    public void whenEquals() throws NoMoneyexeption {
        Machine machine = new Machine();
        int[] expected = {};
        int[] rsl = machine.change(100, 100);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by35()throws NoMoneyexeption {
        Machine machine = new Machine();
        int[] expected = {10, 5};
        int[] rsl = machine.change(50, 35);
        assertThat(rsl, is(expected));
    }


    @Test
    public void when100by12()throws NoMoneyexeption {
        Machine machine = new Machine();
        int[] expected = {10,10,10,10,10,10,10,10, 5,2,1};
        int[] rsl = machine.change(100, 12);
        assertThat(rsl, is(expected));
    }

    @Test (expected = NoMoneyexeption.class)
    public void whenNoMoney()throws NoMoneyexeption {
        Machine machine = new Machine();

        int[] rsl = machine.change(5, 12);

    }

}