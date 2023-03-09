package com.l2borowski.talkingclock.util;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Clock
{
    // Returns string with current time, following HH:mm format
    public static String getCurrentTime()
    {
        DateFormat timeFormat = new SimpleDateFormat("HH:mm");
        Time currentTime = new Time(System.currentTimeMillis());
        String currentTimeStr = timeFormat.format(currentTime).toString();

        return currentTimeStr;
    }
}
