package prototype;

import java.util.Date;

class HourHand extends Hand {
    public HourHand(int value) {
        super(value);
    }

    public void setTime(Date time) {
        value = (time.getHours() % 12) + (time.getMinutes() / 60);
    }

    @Override
    public HourHand clone() throws CloneNotSupportedException {
        return (HourHand) super.clone();
    }
}