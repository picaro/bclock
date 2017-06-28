package com.ubs.opsit.interviews;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalTime;

@Slf4j
public class BerlinClockTimeConverter implements TimeConverter {

    @Override
    public String convertTime(String aTime) {
        LocalTime time = LocalTime.parse(aTime);
        log.debug("source time: " + time.toString());

        BerlinClockDTO berlinClockDTO = new BerlinClockDTO();
        berlinClockDTO.setSecondsLampTop(BerlinClockUtil.calcTopSeconds(time.getSecond()));
        berlinClockDTO.setHoursLamp1(BerlinClockUtil.calcHours1(time.getHour()));
        berlinClockDTO.setHoursLamp2(BerlinClockUtil.calcHours2(time.getHour()));
        berlinClockDTO.setMinutesLamp(BerlinClockUtil.calcMinutes(time.getMinute()));
        berlinClockDTO.setSecondsLamp(BerlinClockUtil.calcSeconds(time.getSecond()));
        return berlinClockDTO.toString();
    }

}
