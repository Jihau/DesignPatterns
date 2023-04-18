package prototype;

import java.util.Date;

class MinuteHand extends Hand {
    public MinuteHand(int value) {
        super(value);
    }

    public void setTime(Date time) {
        value = time.getMinutes();
    }

    @Override
    public MinuteHand clone() throws CloneNotSupportedException {
        return (MinuteHand) super.clone();
    }
}
