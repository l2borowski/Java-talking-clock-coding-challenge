package com.l2borowski.talkingclock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TalkingClockTests
{
	TalkingClock talkingClock = new TalkingClock();

	@Test
	void itShouldPrintOneOclock()
	{
		// given
		int hour = 1;
		int minute = 0;

		// when
		String result = talkingClock.printLiteralTime(hour, minute);

		// then
		String expected = "One o'clock";
		Assertions.assertEquals(expected, result);
	}

	@Test
	void itShouldPrintOneOclockAgain()
	{
		// given
		int hour = 13;
		int minute = 0;

		// when
		String result = talkingClock.printLiteralTime(hour, minute);

		// then
		String expected = "One o'clock";
		Assertions.assertEquals(expected, result);
	}

	@Test
	void itShouldPrintFivePastOne()
	{
		// given
		int hour = 13;
		int minute = 5;

		// when
		String result = talkingClock.printLiteralTime(hour, minute);

		// then
		String expected = "Five past one";
		Assertions.assertEquals(expected, result);
	}

	@Test
	void itShouldPrintTenPastOne()
	{
		// given
		int hour = 13;
		int minute = 10;

		// when
		String result = talkingClock.printLiteralTime(hour, minute);

		// then
		String expected = "Ten past one";
		Assertions.assertEquals(expected, result);
	}

	@Test
	void itShouldPrintTwentyFivePastOne()
	{
		// given
		int hour = 13;
		int minute = 25;

		// when
		String result = talkingClock.printLiteralTime(hour, minute);

		// then
		String expected = "Twenty five past one";
		Assertions.assertEquals(expected, result);
	}

	@Test
	void itShouldPrintHalfPastOne()
	{
		// given
		int hour = 13;
		int minute = 30;

		// when
		String result = talkingClock.printLiteralTime(hour, minute);

		// then
		String expected = "Half past one";
		Assertions.assertEquals(expected, result);
	}

	@Test
	void itShouldPrintTwentyFiveToTwo()
	{
		// given
		int hour = 13;
		int minute = 35;

		// when
		String result = talkingClock.printLiteralTime(hour, minute);

		// then
		String expected = "Twenty five to two";
		Assertions.assertEquals(expected, result);
	}

	@Test
	void itShouldPrintFiveToTwo()
	{
		// given
		int hour = 13;
		int minute = 55;

		// when
		String result = talkingClock.printLiteralTime(hour, minute);

		// then
		String expected = "Five to two";
		Assertions.assertEquals(expected, result);
	}

	@Test
	void itShouldPrintTwoOclock()
	{
		// given
		int hour = 2;
		int minute = 0;

		// when
		String result = talkingClock.printLiteralTime(hour, minute);

		// then
		String expected = "Two o'clock";
		Assertions.assertEquals(expected, result);
	}

	@Test
	void itShouldPrintFifteenToMidnight()
	{
		// given
		int hour = 23;
		int minute = 45;

		// when
		String result = talkingClock.printLiteralTime(hour, minute);

		// then
		String expected = "Fifteen to midnight";
		Assertions.assertEquals(expected, result);
	}

	@Test
	void itShouldPrintElevenLiteral()
	{
		// given
		int hour = 11;

		// when
		String result = talkingClock.getLiteralHour(hour);

		// then
		String expected = "Eleven";
		Assertions.assertEquals(expected, result);
	}
}