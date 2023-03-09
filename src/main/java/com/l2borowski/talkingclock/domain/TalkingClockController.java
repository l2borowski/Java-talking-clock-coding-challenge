package com.l2borowski.talkingclock.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class TalkingClockController
{
    private final TalkingClockService service;

    @GetMapping(value = "/talking-clock", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TalkingClockResponse> getTime(
            @RequestBody TalkingClockRequest request)
    {
        return ResponseEntity.ok(service.getTime(request));
    }

    @GetMapping(value = "/talking-clock/current-time", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TalkingClockResponse> getCurrentTime()
    {
        return ResponseEntity.ok(service.getCurrentTime());
    }
}
