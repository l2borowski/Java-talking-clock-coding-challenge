package com.l2borowski.talkingclock.domain;

import com.l2borowski.talkingclock.model.TalkingClock;
import com.l2borowski.talkingclock.util.Clock;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.Console;

@Service
@RequiredArgsConstructor
public class TalkingClockService
{
    private final TalkingClock talkingClock;

    public TalkingClockResponse getTime(TalkingClockRequest request)
    {
        System.out.println("Empty request");

        int hour = Integer.parseInt(request.getHour());
        int minute = Integer.parseInt(request.getMinute());

        String literalTime = talkingClock.printLiteralTime(hour, minute);

        return TalkingClockResponse
                .builder()
                .value(literalTime)
                .build();
    }

    public TalkingClockResponse getCurrentTime()
    {
        String currentTimeStr = Clock.getCurrentTime();

        int currentHour = Integer.parseInt(currentTimeStr.split(":")[0]);
        int currentMinute = Integer.parseInt(currentTimeStr.split(":")[1]);

        String literalTime = talkingClock.printLiteralTime(currentHour, currentMinute);

        return TalkingClockResponse
                .builder()
                .value(literalTime)
                .build();
    }
}
