package com.ubs.opsit.interviews;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;

import java.time.LocalTime;

@Slf4j
public class BerlinClockTimeConverter implements TimeConverter {

    public static final String O_SYM = "O";

    @Override
    public String convertTime(String aTime) {
        LocalTime time = LocalTime.parse(aTime);
        log.debug("source time: " + time.toString());

        BerlinClockDTO berlinClockDTO = new BerlinClockDTO();
        berlinClockDTO.setSecondsLampTop(calcTopSeconds(time.getSecond()));
        berlinClockDTO.setHoursLamp1(calcHours1(time.getHour()));
        berlinClockDTO.setHoursLamp2(calcHours2(time.getHour()));
        berlinClockDTO.setMinutesLamp(calcMinutes(time.getMinute()));
        berlinClockDTO.setSecondsLamp(calcSeconds(time.getSecond()));
        return berlinClockDTO.toString();
    }

    private String calcSeconds(int second) {
        second = second % 5;
        return numToLingts("Y",second, 4);
    }

    private String calcMinutes(int minute) {
        minute = minute / 5;
        return applyColorsForMinutes(numToLingts("Y", minute, 11));
    }

    private String applyColorsForMinutes(String y) {
        String out = "";
        for (int i = 0; i < y.length() ; i++) {
            out += y.charAt(i)=='Y' && (i == 2 || i == 5 || i == 8 )? 'R' : y.charAt(i);
        }
        return out;
    }

    private String calcHours2(int hour) {
        hour = hour % 5;
        return numToLingts("R", hour, 4);
    }

    private String calcHours1(int hour) {
        hour = hour / 5;
        return numToLingts("R", hour, 4);
    }

    private String calcTopSeconds(int second) {
        return  (second % 2 == 0) ? "Y" : "O";
    }

    private String numToLingts(String inchr, int repeat, int length){
        return StringUtils.repeat(inchr, repeat).concat(StringUtils.repeat(O_SYM, length - repeat));
    }

}
