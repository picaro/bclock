package com.ubs.opsit.interviews;

import org.junit.Test;

import static org.junit.Assert.*;

public class BerlinClockUtilTest {

    @Test
    public void calcSeconds() throws Exception {
        assertEquals("OOOO", BerlinClockUtil.calcSeconds(0));
        assertEquals("YOOO", BerlinClockUtil.calcSeconds(1));
        assertEquals("OOOO", BerlinClockUtil.calcSeconds(10));
        assertEquals("YYYO", BerlinClockUtil.calcSeconds(43));
        assertEquals("OOOO", BerlinClockUtil.calcSeconds(50));
        assertEquals("YYYY", BerlinClockUtil.calcSeconds(59));
    }

    @Test
    public void calcMinutes() throws Exception {
        assertEquals("OOOOOOOOOOO", BerlinClockUtil.calcMinutes(0));
        assertEquals("YOOOOOOOOOO", BerlinClockUtil.calcMinutes(5));
        assertEquals("YYROOOOOOOO", BerlinClockUtil.calcMinutes(15));
        assertEquals("YYRYOOOOOOO", BerlinClockUtil.calcMinutes(21));
        assertEquals("YYRYYRYYRYY", BerlinClockUtil.calcMinutes(59));
    }

    @Test
    public void calcHours2() throws Exception {
        assertEquals("OOOO", BerlinClockUtil.calcHours2(0));
        assertEquals("ROOO", BerlinClockUtil.calcHours2(1));
        assertEquals("OOOO", BerlinClockUtil.calcHours2(10));
        assertEquals("RRRO", BerlinClockUtil.calcHours2(23));
    }

    @Test
    public void calcHours1() throws Exception {
        assertEquals("OOOO", BerlinClockUtil.calcHours1(0));
        assertEquals("OOOO", BerlinClockUtil.calcHours1(2));
        assertEquals("ROOO", BerlinClockUtil.calcHours1(5));
        assertEquals("ROOO", BerlinClockUtil.calcHours1(8));
        assertEquals("RROO", BerlinClockUtil.calcHours1(12));
        assertEquals("RRRR", BerlinClockUtil.calcHours1(23));
    }

    @Test
    public void calcTopSeconds() throws Exception {
        assertEquals("O", BerlinClockUtil.calcTopSeconds(0));
        assertEquals("Y", BerlinClockUtil.calcTopSeconds(51));
    }

}