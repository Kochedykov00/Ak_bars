package interfaces;

import java.util.Date;

public interface AlarmClockInterface {





    void turnOn();
    void turnOff();
    public void setUp(Date date);
    void stop();
    Date showTime();



}
