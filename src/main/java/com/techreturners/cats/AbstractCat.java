package com.techreturners.cats;

abstract class AbstractCat implements Cat{

    boolean isAsleep;
    String setting;
    int height;

    AbstractCat(String setting, int height){
        this.setting = setting;
        this.height = height;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getSetting() {
        return this.setting;
    }

    public int getAverageHeight() {
        return this.height;
    }

    public boolean isAsleep() {
        return this.isAsleep;
    }

    public void wakeUp() {
        this.isAsleep= false;
    }

    public void goToSleep() {
        this.isAsleep = true;
    }

    public void run() {}

    abstract public String eat();
}