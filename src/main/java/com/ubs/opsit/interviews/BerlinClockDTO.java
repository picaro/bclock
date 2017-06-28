package com.ubs.opsit.interviews;

import lombok.Data;

@Data
public class BerlinClockDTO {
    private String secondsLampTop = null;
    private String hoursLamp1 = null;
    private String hoursLamp2 = null;
    private String minutesLamp = null;
    private String secondsLamp = null;

    @Override
    public String toString() {
        return secondsLampTop + System.lineSeparator() +
                hoursLamp1 + System.lineSeparator() +
                hoursLamp2 + System.lineSeparator() +
                minutesLamp + System.lineSeparator() +
                secondsLamp;
    }
}
