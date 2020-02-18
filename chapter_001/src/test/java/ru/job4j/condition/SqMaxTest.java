package ru.job4j.condition;

import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.converter.Converter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class SqMaxTest {
    @Test
    public void square() {
        int first = 7;
        int second = 8;
        int third = 7;
        int forth = 14;


        int expected = SqMax.max(first, second, third, forth);
        assertThat(expected, is(14));
    }

    @Test
    public void square1() {
        int first = 5;
        int second = 4;
        int third = 2;
        int forth = 3;


        int expected = SqMax.max(first, second, third, forth);
        assertThat(expected, is(5));
    }


    public static class ConverterTest {

        @Test
        public void rubleToEuro() {
            int in = 140;
            int expected = 2;
            int out = Converter.rubleToEuro(in);
            Assert.assertEquals(expected, out);
        }

        @Test


        public void rubleToDollar() {
            int in = 180;
            int expected = 3;
            int out = Converter.rubleToDollar(in);
            Assert.assertEquals(expected, out);
        }

        @Test
        public void dollarToRuble() {
            int in = 10;
            int expected = 600;
            int out = Converter.dollarToRuble(in);
            Assert.assertEquals(expected, out);
        }

        @Test
        public void euroToRuble() {
            int in = 10;
            int expected = 700;
            int out = Converter.euroToRuble(in);
            Assert.assertEquals(expected, out);
        }


    }
}

