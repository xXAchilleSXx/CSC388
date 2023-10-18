package Clocks;

import org.junit.*;
import static org.junit.Assert.*;

public class ClockTest {
  
  private TwelveHourClock zero;
  private TwelveHourClock sec59;
  private TwelveHourClock min59;
  private TwelveHourClock hour12;
  private TwelveHourClock hour12pm;
  private TwelveHourClock seconds59;
  private TwelveHourClock minutes59;
  private TwelveHourClock hour12AM;
  private TwelveHourClock  hour12PM;
  
  @Before
    public void setUp() {
        zero = new TwelveHourClock(1, 0, 0, true);
        sec59 = new TwelveHourClock(12, 58, 59, true);
        min59 = new TwelveHourClock(11, 59, 59, true);
        hour12 = new TwelveHourClock(12, 59, 59, true);
        hour12pm = new TwelveHourClock(12, 59, 59, false);

        seconds59 = new TwelveHourClock(1, 0, 59, true);
        minutes59 = new TwelveHourClock(1, 59, 0, true);
        hour12AM = new TwelveHourClock(12, 0, 0, true);
        hour12PM = new TwelveHourClock(12, 0, 0, false);
    }

    @Test
    public void testIncrementSeconds() {
        zero.incrementSeconds();
        sec59.incrementSeconds();

        assertEquals(1, zero.seconds());
        assertEquals(0, sec59.seconds());
        assertEquals(58, sec59.minutes());
    }

    @Test
    public void testIncrementMinutes() {
        zero.incrementMinutes();
        min59.incrementMinutes();

        assertEquals(1, zero.minutes());
        assertEquals(0, min59.minutes());
        assertEquals(11, min59.hours());
    }

    @Test
    public void testIncrementHours() {
        zero.incrementHours();
        hour12.incrementHours();

        assertEquals(2, zero.hours());
        assertEquals(1, hour12.hours());
        assertTrue(hour12.isAM());
    }

    @Test
    public void testIncrementSecondsBoundary() {
        // Test seconds rollover from 59 to 0
        seconds59.incrementSeconds();

        assertEquals(0, seconds59.seconds());
        assertEquals(0, seconds59.minutes());
    }

    @Test
    public void testIncrementMinutesBoundary() {
        // Test minutes rollover from 59 to 0
        minutes59.incrementMinutes();

        assertEquals(0, minutes59.minutes());
        assertEquals(1, minutes59.hours());
    }

    @Test
    public void testIncrementHoursBoundary() {
        // Test hours rollover from 12 to 1
        hour12AM.incrementHours();
        hour12PM.incrementHours();

        assertEquals(1, hour12AM.hours());
        assertEquals(1, hour12PM.hours());
        assertTrue(hour12AM.isAM());
        assertFalse(hour12PM.isAM());
    }
}


