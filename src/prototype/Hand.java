package prototype;

import java.util.Date;

abstract class Hand implements Cloneable {
    protected int value;

    public Hand(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public abstract void setTime(Date time);

    public void tick() {
        value = (value + 1) % 60;
    }

    @Override
    public Hand clone() throws CloneNotSupportedException {
        return (Hand) super.clone();
    }

    @Override
    public String toString() {
        return String.format("%02d", value);
    }
}