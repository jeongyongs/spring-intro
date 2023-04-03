package com.jeongyongs.keyword;

import java.util.HashMap;
import java.util.Map;

public class KeywordDao {
    private Map<String, String> db = new HashMap<>();

    public KeywordDao() {
        System.out.println("DAO: db has been created.");
    }

    public void insert(String key, String value) {
        db.put(key, value);
        System.out.println("DAO: saved {" + key + " : " + value + "} in the db.");
    }

    public String select(String key) {
        System.out.println("DAO: retrieving the value of " + key + " from the db.");
        return db.get(key);
    }

    public void update(String key, String value) {
        db.replace(key, value);
        System.out.println("DAO: updated {" + key + " : " + value + "} in the db.");
    }

    public void delete(String key) {
        db.remove(key);
        System.out.println("DAO: deleted " + key + " from the db.");
    }
}
