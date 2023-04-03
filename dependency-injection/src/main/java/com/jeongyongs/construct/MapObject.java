package com.jeongyongs.construct;

import java.util.Map;

public class MapObject {
    private Map<String, String> map;

    public Map<String, String> getMap() {
        return map;
    }

    // 'key-value' or 'key-ref'
    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
