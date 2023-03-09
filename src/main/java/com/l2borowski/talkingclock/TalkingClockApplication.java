package com.l2borowski.talkingclock;

import com.l2borowski.talkingclock.model.TalkingClock;
import com.l2borowski.talkingclock.util.Clock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TalkingClockApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(TalkingClockApplication.class, args);

		TalkingClock talkingClock = new TalkingClock();
		if (args == null || args.length == 0)
		{
			// No arguments provided. Generate current hour and minute
			String currentTimeStr = Clock.getCurrentTime();
			try
			{
				int currentHour = Integer.parseInt(currentTimeStr.split(":")[0]);
				int currentMinute = Integer.parseInt(currentTimeStr.split(":")[1]);
				talkingClock.printLiteralTime(currentHour, currentMinute);
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		else
		{
			try
			{
				// Argument provided. Use provided hour and minute
				int providedHour = Integer.parseInt(args[0].split(":")[0]);
				int providedMinute = Integer.parseInt(args[0].split(":")[1]);
				talkingClock.printLiteralTime(providedHour, providedMinute);
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

}
