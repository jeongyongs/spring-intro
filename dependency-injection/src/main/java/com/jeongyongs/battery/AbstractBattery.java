package com.jeongyongs.battery;

public abstract class AbstractBattery {
    protected Battery battery;

    // print battery amount
    public void printBattery() {
        System.out.println(battery.getAmount());
    }

    // set battery amount
    public void charge(int amount) {
        battery.setAmount(amount);
    }
}
