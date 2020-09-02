package models;

import interfaces.RadioInterface;

public class Radio implements RadioInterface {

    public String wave;
    public String model;
    public String color;
    public long yearOfEnterprise;
    public boolean isActive;
    public boolean isStop;
    public int volume;

    public Radio() {
    }

    public Radio(String wave, String model, String color, long yearOfEnterprise, boolean isActive, boolean isStop, int volume) {
        this.wave = wave;
        this.model = model;
        this.color = color;
        this.yearOfEnterprise = yearOfEnterprise;
        this.isActive = isActive;
        this.isStop = isStop;
        this.volume = volume;
    }

    public String getWave() {
        return wave;
    }

    public void setWave(String wave) {
        this.wave = wave;
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

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
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
    public void setUp(String wave) {
        this.wave = wave;
    }

    @Override
    public void stop() {
        this.isStop = true;
    }




}
