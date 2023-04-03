package com.jeongyongs.construct;

public class ConstructDi {
    private InjectionObject injectionObject;

    public ConstructDi(InjectionObject injectionObject) {
        this.injectionObject = injectionObject;
    }

    public InjectionObject getInjectionObject() {
        return injectionObject;
    }
}
