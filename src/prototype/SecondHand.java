package prototype;

import java.util.Date;

class SecondHand extends Hand {
    public SecondHand(int value) {
        super(value);
    }

    public void setTime(Date time) {
        value = time.getSeconds();
    }

    @Override
    public SecondHand clone() throws CloneNotSupportedException {
        return (SecondHand) super.clone();
    }
}