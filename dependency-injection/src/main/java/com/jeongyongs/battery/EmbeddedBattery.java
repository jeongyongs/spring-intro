package com.jeongyongs.battery;

public class EmbeddedBattery extends AbstractBattery {
    public EmbeddedBattery() {
        this.battery = new Battery(100);
    }
}
