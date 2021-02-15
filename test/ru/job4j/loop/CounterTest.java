package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromTwoToHundredThenTenThousandOneHundred() {
        int rsl = Counter.sumByEven(2, 200);
        int expected = 10100;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromOneToFiftyThenSixHundredFifty() {
        int rsl = Counter.sumByEven(1, 50);
        int expected = 650;
        assertThat(rsl, is(expected));
    }

}