package models;

import interfaces.AlarmClockInterface;

import java.util.Date;

public class AlarmClock implements AlarmClockInterface {

    public String model;
    public String color;
    public long yearOfEnterprise;
    public boolean isActive;
    public boolean isStop;
    public int volume;
    public Date time;

    public AlarmClock() {
    }

    public AlarmClock(String model, String color, long yearOfEnterprise, boolean isActive, boolean isStop, int volume, Date time) {
        this.model = model;
        this.color = color;
        this.yearOfEnterprise = yearOfEnterprise;
        this.isActive = isActive;
        this.isStop = isStop;
        this.volume = volume;
        this.time = time;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getYearOfEnterprise() {
        return yearOfEnterprise;
    }

    public void setYearOfEnterprise(long yearOfEnterprise) {
        this.yearOfEnterprise = yearOfEnterprise;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isStop() {
        return isStop;
    }

    public void setStop(boolean stop) {
        isStop = stop;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void turnOn() {
        this.isActive = true;

    }

    @Override
    public void turnOff() {
        this.isActive = false;
    }

    @Override
    public void setUp(Date date) {
        this.time = time;
    }

    @Override
    public void stop() {
        this.isStop = true;
    }



    @Override
    public Date showTime() {
        return time;
    }

}

