package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void nameOfDayMon() {
        String name = SwitchWeek.nameOfDay(1);
        assertThat(name, is("Понедельник"));
    }

    @Test
    public void nameOfDayWen() {
        String name = SwitchWeek.nameOfDay(3);
        assertThat(name, is("Среда"));
    }

    @Test
    public void nameOfDayError() {
        String name = SwitchWeek.nameOfDay(10);
        assertThat(name, is("Ошибка"));
    }
}