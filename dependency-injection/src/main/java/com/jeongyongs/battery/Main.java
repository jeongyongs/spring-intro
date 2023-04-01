package com.jeongyongs.battery;

public class Main {
    public static void main(String[] args) {
        // create objects
        EmbeddedBattery embeddedBattery = new EmbeddedBattery();
        ExternalBattery externalBattery = new ExternalBattery(new Battery(100));

        // call print method
        embeddedBattery.printBattery();
        externalBattery.printBattery();

        // DI
        externalBattery.setBattery(new Battery(100));
    }
}
