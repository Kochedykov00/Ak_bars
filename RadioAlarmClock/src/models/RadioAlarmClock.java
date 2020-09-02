package models;

import interfaces.RadioAlarmInterface;

import java.util.Date;

public class RadioAlarmClock implements RadioAlarmInterface {

    public String model;
    public String color;
    public long yearOfEnterprise;
    public boolean isActive;
    public boolean isStop;
    public int volume;
    public String wave;
    public Date time;

    public RadioAlarmClock() {
    }

    public RadioAlarmClock(String model, String color, long yearOfEnterprise, boolean isActive, boolean isStop, int volume, String wave, Date date) {
        this.model = model;
        this.color = color;
        this.yearOfEnterprise = yearOfEnterprise;
        this.isActive = false;
        this.isStop = false;
        this.volume = volume;
        this.wave = wave;
        this.time = date;
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
    public void setUp(String wave, Date date) {
        this.wave = wave;
        this.time = date;
    }

    @Override
    public void stop() {
        this.isStop = true;
    }



    @Override
    public Date showTime() {
        return time;
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

    public String getWave() {
        return wave;
    }

    public void setWave(String wave) {
        this.wave = wave;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
