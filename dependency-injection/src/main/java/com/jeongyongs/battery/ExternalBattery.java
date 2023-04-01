package com.jeongyongs.battery;

public class ExternalBattery extends AbstractBattery {
    public ExternalBattery(Battery battery) {
        this.battery = battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }
}
