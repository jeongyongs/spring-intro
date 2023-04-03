package com.jeongyongs.construct;

public class InjectionObject {
    private String name;

    public String getName() {
        return name;
    }

    // determining the property name is the word after "set" in the method name
    // writing property name in lowercase
    public void setName(String name) {
        this.name = name;
    }
}
