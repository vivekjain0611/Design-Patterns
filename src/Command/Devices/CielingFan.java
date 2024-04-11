package Command.Devices;

public class CielingFan {
    private static final int LOW = 1;
    private static final int MEDIUM = 2;
    private static final int HIGH = 2;
    private static final int OFF = 4;

    public CielingFan() {
        this.speed = OFF;
    }

    int speed;

    public int getSpeed() {
        return this.speed;
    }


}
