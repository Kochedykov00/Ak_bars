package interfaces;

import java.util.Date;

public interface RadioAlarmInterface extends RadioInterface, AlarmClockInterface {






    void turnOn();
    void turnOff();
    void setUp(String wave);
    void stop();
    Date showTime();


}
