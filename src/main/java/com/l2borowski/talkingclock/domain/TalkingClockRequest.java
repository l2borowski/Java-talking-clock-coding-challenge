package com.l2borowski.talkingclock.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TalkingClockRequest
{
    private String hour;
    private String minute;
}
