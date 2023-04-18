package prototype;

import java.util.*;

class Clock implements Cloneable {
    private HourHand hourHand;
    private MinuteHand minuteHand;
    private SecondHand secondHand;

    public Clock(HourHand hourHand, MinuteHand minuteHand, SecondHand secondHand) {
        this.hourHand = hourHand;
        this.minuteHand = minuteHand;
        this.secondHand = secondHand;
    }

    public void setTime(Date time) {
        hourHand.setTime(time);
        minuteHand.setTime(time);
        secondHand.setTime(time);
    }

    public void tick() {
        secondHand.tick();
        if (secondHand.getValue() == 0) {
            minuteHand.tick();
            if (minuteHand.getValue() == 0) {
                hourHand.tick();
            }
        }
    }

    @Override
    public Clock clone() throws CloneNotSupportedException {
        Clock clock = (Clock) super.clone();
        clock.hourHand = hourHand.clone();
        clock.minuteHand = minuteHand.clone();
        clock.secondHand = secondHand.clone();
        return clock;
    }

    @Override
    public String toString() {
        return hourHand.toString() + ":" + minuteHand.toString() + ":" + secondHand.toString();
    }
}