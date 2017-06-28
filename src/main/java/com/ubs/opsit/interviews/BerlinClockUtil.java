package com.ubs.opsit.interviews;

import org.apache.commons.lang.StringUtils;

public class BerlinClockUtil {


    public static final String O_SYM = "O";

    public static String calcSeconds(int second) {
        second = second % 5;
        return numToLingts("Y", second, 4);
    }

    public static String calcMinutes(int minute) {
        minute = minute / 5;
        return applyColorsForMinutes(numToLingts("Y", minute, 11));
    }

    public static String applyColorsForMinutes(String y) {
        String out = "";
        for (int i = 0; i < y.length(); i++) {
            out += y.charAt(i) == 'Y' && (i == 2 || i == 5 || i == 8) ? 'R' : y.charAt(i);
        }
        return out;
    }

    public static String calcHours2(int hour) {
        hour = hour % 5;
        return numToLingts("R", hour, 4);
    }

    public static String calcHours1(int hour) {
        hour = hour / 5;
        return numToLingts("R", hour, 4);
    }

    public static String calcTopSeconds(int second) {
        return (second % 2 != 0) ? "Y" : "O";
    }

    private static String numToLingts(String inchr, int repeat, int length) {
        return StringUtils.repeat(inchr, repeat).concat(StringUtils.repeat(O_SYM, length - repeat));
    }

}
