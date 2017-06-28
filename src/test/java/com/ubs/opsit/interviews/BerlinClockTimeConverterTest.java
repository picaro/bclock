package com.ubs.opsit.interviews;

import org.junit.Test;

import static org.junit.Assert.*;

public class BerlinClockTimeConverterTest {

    private BerlinClockTimeConverter converter = new BerlinClockTimeConverter();

    @Test
    public void testThatWeCouldConvertTimeForZeroTime() throws Exception {
        BerlinClockDTO dto = new BerlinClockDTO();
        dto.setSecondsLampTop("O");
        dto.setHoursLamp1("OOOO");
        dto.setHoursLamp2("OOOO");
        dto.setMinutesLamp("OOOOOOOOOOO");
        dto.setSecondsLamp("OOOO");
        assertEquals(dto.toString(), converter.convertTime("00:00:00"));
    }

    @Test
    public void testThatWeCouldConvertTimeForSomeTime() throws Exception {
        BerlinClockDTO dto = new BerlinClockDTO();
        dto.setSecondsLampTop("O");
        dto.setHoursLamp1("RROO");
        dto.setHoursLamp2("OOOO");
        dto.setMinutesLamp("YYOOOOOOOOO");
        dto.setSecondsLamp("OOOO");
        assertEquals(dto.toString(), converter.convertTime("10:10:10"));
    }

}