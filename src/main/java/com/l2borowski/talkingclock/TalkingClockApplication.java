package com.l2borowski.talkingclock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class TalkingClockApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(TalkingClockApplication.class, args);
		printLiteralCurrentTime();
	}

	public static String printLiteralCurrentTime()
	{
		String literalCurrentTime = new String();

		DateFormat timeFormat = new SimpleDateFormat("HH:mm");
		Time currentTime = new Time(System.currentTimeMillis());
		String currentTimeStr = timeFormat.format(currentTime).toString();

		int currentHour = Integer.parseInt(currentTimeStr.split(":")[0]);
		int currentMinute = Integer.parseInt(currentTimeStr.split(":")[1]);

		if (currentMinute <= 0)
		{
			// If minutes are equal to 0 then add "o'clock" after literal current hour
			System.out.println(getLiteralHour(currentHour) + " o'clock");
		}
		else
		{
			if (currentMinute <= 29)
			{
				// Print literal minutes followed by word 'past' & literal current hour, if current minute is less or equal to 29
				System.out.println(getLiteralMinute(currentMinute) + " past " + getLiteralHour(currentHour).toLowerCase());
			}
			else if (currentMinute == 30)
			{
				// If current minute is at 30, print 'Half past' followed by literal current hour
				System.out.println("Half past " + getLiteralHour(currentHour));
			}
			else
			{
				// If current minute is higher than 30, print literal remaining minutes to the next hour, followed by 'to' & literal next hour.
				int remainingMinutes = 60 - currentMinute;
				int nextHour = 1 + currentHour;
				System.out.println(getLiteralMinute(remainingMinutes) + " to " + getLiteralHour(nextHour).toLowerCase());
			}
		}

		return literalCurrentTime;
	}

	public static String getLiteralHour(int hour)
	{
		String literalHour = new String();
		switch (hour)
		{
			case 0:
				literalHour = "Midnight";
				break;
			case 1:
			case 13:
				literalHour = "One";
				break;
			case 2:
			case 14:
				literalHour = "Two";
				break;
			case 3:
			case 15:
				literalHour = "Three";
				break;
			case 4:
			case 16:
				literalHour = "Four";
				break;
			case 5:
			case 17:
				literalHour = "Five";
				break;
			case 6:
			case 18:
				literalHour = "Six";
				break;
			case 7:
			case 19:
				literalHour = "Seven";
				break;
			case 8:
			case 20:
				literalHour = "Eight";
				break;
			case 9:
			case 21:
				literalHour = "Nine";
				break;
			case 10:
			case 22:
				literalHour = "Ten";
				break;
			case 11:
			case 23:
				literalHour = "Eleven";
				break;
			case 12:
				literalHour = "Noon";
				break;
			default:
				break;
		}

		return literalHour;
	}

	public static String getLiteralMinute(int minute)
	{
		String literalMinute = new String();

		switch (minute)
		{
			case 1:
				literalMinute = "One";
				break;
			case 2:
				literalMinute = "Two";
				break;
			case 3:
				literalMinute = "Three";
				break;
			case 4:
				literalMinute = "Four";
				break;
			case 5:
				literalMinute = "Five";
				break;
			case 6:
				literalMinute = "Six";
				break;
			case 7:
				literalMinute = "Seven";
				break;
			case 8:
				literalMinute = "Eight";
				break;
			case 9:
				literalMinute = "Nine";
				break;
			case 10:
				literalMinute = "Ten";
				break;
			case 11:
				literalMinute = "Eleven";
				break;
			case 12:
				literalMinute = "Twelve";
				break;
			case 13:
				literalMinute = "Thirteen";
				break;
			case 14:
				literalMinute = "Fourteen";
				break;
			case 15:
				literalMinute = "Fifteen";
				break;
			case 16:
				literalMinute = "Sixteen";
				break;
			case 17:
				literalMinute = "Seventeen";
				break;
			case 18:
				literalMinute = "Eighteen";
				break;
			case 19:
				literalMinute = "Nineteen";
				break;
			case 20:
				literalMinute = "Twenty";
				break;
			case 21:
				literalMinute = "Twenty one";
				break;
			case 22:
				literalMinute = "Twenty two";
				break;
			case 23:
				literalMinute = "Twenty three";
				break;
			case 24:
				literalMinute = "Twenty four";
				break;
			case 25:
				literalMinute = "Twenty five";
				break;
			case 26:
				literalMinute = "Twenty six";
				break;
			case 27:
				literalMinute = "Twenty seven";
				break;
			case 28:
				literalMinute = "Twenty eight";
				break;
			case 29:
				literalMinute = "Twenty nine";
				break;
		}

		return literalMinute;
	}
}
